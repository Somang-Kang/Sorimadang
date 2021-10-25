package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.example.myapplication.ui.Instrument.InstrumentFragment.gugakgiApi;

import java.io.IOException;

public class InstStudyActivity extends AppCompatActivity {

    TextView ghtWhat, akgi;
    int whatAkgi; //1이면 관악기, 2이면 현악기, 3이면 타악기
    int akgiNum; //악기이름
    ImageView akgiImg;

    Button bt1, bt2, bt3, bt4;
    String url; //음악 링크
    MediaPlayer mp; //음악 재생을 위한 객체
    int pos; //재생 멈춘 시점
    SeekBar sb; //음악 재생위치 - 시크바
    boolean isPlaying = false; //재생중인지 확인

    class MyThread extends Thread {
        @Override
        public void run() { // 쓰레드가 시작되면 콜백되는 메서드
            // 씨크바 막대기 조금씩 움직이기 (노래 끝날 때까지 반복)
            while(isPlaying) {
                sb.setProgress(mp.getCurrentPosition());
            }
        }
    }    // 출처: https://bitsoul.tistory.com/28 [Happy Programmer~]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst_study);

        akgi = findViewById(R.id.instStudyTextView1); //악기이름
        //ghtWhat = findViewById(R.id.instStudyTextView2); //악기종류
        akgiImg = findViewById(R.id.instStudyAkgiImageView); //악기 이미지

        Intent intent = getIntent();
        whatAkgi = intent.getIntExtra("whatAkgi",0);
        akgiNum = intent.getIntExtra("akgi",0);

        //악기종류랑 악기이름 잘 넘겨주는지 확인
        Log.v("getintent",whatAkgi+" "+akgiNum);

        bt1 = findViewById(R.id.instStudybt);
        bt2 = findViewById(R.id.instStudybt2);
        bt3 = findViewById(R.id.instStudybt3);
        bt4 = findViewById(R.id.instStudybt4);
        sb = findViewById(R.id.instStudyseekBar);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                isPlaying = true;
                int ttt = seekBar.getProgress(); // 사용자가 움직여놓은 위치
                mp.seekTo(ttt);
                mp.start();
                new MyThread().start();
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                isPlaying = false;
                mp.pause();
            }
            public void onProgressChanged(SeekBar seekBar,int progress,boolean fromUser) {
                if (seekBar.getMax()==progress) {
                    bt1.setVisibility(View.VISIBLE);
                    bt4.setVisibility(View.INVISIBLE);
                    bt2.setVisibility(View.INVISIBLE);
                    bt3.setVisibility(View.INVISIBLE);
                    isPlaying = false;
                    mp.stop();
                }
            }
        });


        //클래스에서 악기 찾아서 그림 표시, 소리표시
        if(whatAkgi==1){
            //관악기
            akgi.setText(gugakgiApi.akgiNameG[akgiNum]);
            //ghtWhat.setText("관악기");
            Glide.with(this).load(gugakgiApi.imgUrlG[akgiNum]).override(800,750).into(akgiImg);
            url = gugakgiApi.soundUrlG[akgiNum]; // your URL here
        }else if(whatAkgi==2){
            //현악기
            akgi.setText(gugakgiApi.akgiNameH[akgiNum]);
            Glide.with(this).load(gugakgiApi.imgUrlH[akgiNum]).override(800,750).into(akgiImg);
            url = gugakgiApi.soundUrlH[akgiNum];
        }else if(whatAkgi==3){
            //타악기
            akgi.setText(gugakgiApi.akgiNameT[akgiNum]);
            Glide.with(this).load(gugakgiApi.imgUrlT[akgiNum]).override(800,750).into(akgiImg);
            url = gugakgiApi.soundUrlT[akgiNum];
        }

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = new MediaPlayer();
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mp.setDataSource(url);
                    mp.prepare(); // might take long! (for buffering, etc)
                    mp.setLooping(false);
                    mp.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.v("instStudy: ","mediaPlayer error");
                }

                int a = mp.getDuration(); // 노래의 재생시간(miliSecond)
                sb.setMax(a);// 씨크바의 최대 범위를 노래의 재생시간으로 설정
                new MyThread().start(); // 씨크바 그려줄 쓰레드 시작
                isPlaying = true; // 씨크바 쓰레드 반복 하도록

                bt1.setVisibility(View.INVISIBLE);
                bt4.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos = mp.getCurrentPosition();
                mp.pause();
                bt2.setVisibility(View.INVISIBLE);
                bt3.setVisibility(View.VISIBLE);
                isPlaying = false;
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(pos);
                mp.start();
                bt3.setVisibility(View.INVISIBLE);
                bt2.setVisibility(View.VISIBLE);
                isPlaying = true;
                new MyThread().start();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPlaying = false; //쓰레드 정지
                mp.stop();
                mp.release();
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.INVISIBLE);
                bt3.setVisibility(View.INVISIBLE);
                bt4.setVisibility(View.INVISIBLE);
                sb.setProgress(0); //시크바 초기화
            }
        });

    } //end of onCreate

    @Override
    protected void onPause() {
        super.onPause();
        isPlaying = false; // 쓰레드 정지
        if (mp!=null) {
            mp.release(); // 자원해제
        }
        bt1.setVisibility(View.VISIBLE);
        bt4.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
    }

    public void InstbackActivity(View view) {
        startActivity(new Intent(InstStudyActivity.this, InstrumentFragment.class));
    }
}