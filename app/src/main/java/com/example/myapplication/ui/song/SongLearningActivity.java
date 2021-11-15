package com.example.myapplication.ui.song;

import static android.net.wifi.p2p.WifiP2pManager.ERROR;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.Locale;

public class SongLearningActivity extends AppCompatActivity {
    int song_num;
    TextView song_tv;
    Button song_name_bt;
    Button song_listen_bt;
    Button song_listen_bt2;
    Button song_listen_bt3;
    Button other_songs_bt;
    private  MediaPlayer player;
    private int position = 0;
    String url;
    int flag = 0;
    private TextToSpeech tts;
    String minyo_name;
    Fragment SongFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_learning);
        Intent receive_intent = getIntent();
        getSupportActionBar().hide();

        song_num = receive_intent.getIntExtra("song_info",0);

        song_tv = findViewById(R.id.songname_tv);


        song_name_bt = findViewById(R.id.name_tts);
        song_listen_bt = findViewById(R.id.song_listen);
        song_listen_bt2 = findViewById(R.id.song_listen2);
        song_listen_bt3 = findViewById(R.id.song_listen3);
        other_songs_bt = findViewById(R.id.other_songs);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    tts.setLanguage(Locale.KOREAN);
                }
            }
        });
        if(song_num == 1){
            minyo_name= "꼭두각시";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/kkokdugaksi.wav";
        }
        else if(song_num == 2){
            minyo_name= "닐리리야";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/nilliriya.wav";
        }
        else if(song_num == 3){
            minyo_name= "꼭두각시";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/Ganggangsullae.wav";
        }
        else if(song_num == 4){
            minyo_name= "진도아리랑";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/jindoarirang.wav";
        }
        else if(song_num == 5){
            minyo_name= "너영나영";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/jeju/neoyeongnayeong.wav";

        }
        else if(song_num == 6){
            minyo_name= "오돌또기";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/jeju/odolttogi.wav";

        }
        else if(song_num == 7){
            minyo_name= "몽금포타령";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/monggeumpotaryeong.wav";

        }
        else if(song_num == 8){
            minyo_name= "해주아리랑";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/haejuarirang.wav";

        }
        else if(song_num == 9){
            minyo_name= "뱃노래";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/baennorae.wav";

        }
        else if(song_num == 10){
            minyo_name= "밀양아리랑";
            song_tv.setText(minyo_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/miryangarirang.wav";

        }
        song_listen_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });
        song_listen_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == 0) {
                    flag =1;
                    pauseAudio();
                    song_listen_bt2.setText("재개");
                }
                else{
                    flag = 0;
                    resumeAudio();
                    song_listen_bt2.setText("일시정지");
                }

            }
        });
        song_listen_bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
            }
        });
        song_name_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.setPitch(0.9f);
                tts.setSpeechRate(0.9f);
                tts.speak(minyo_name,TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        other_songs_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(SongFragment);
            }
        });



    }

    public void playAudio(){
        try{
            closePlayer();

            player = new MediaPlayer();
            player.setDataSource(url);
            player.prepare();
            player.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pauseAudio(){
        if(player != null){
            position = player.getCurrentPosition();
            player.pause();
        }
    }

    public void resumeAudio(){
        if(player != null && !player.isPlaying()){
            player.seekTo(position);
            player.start();
        }
    }

    public void stopAudio(){
        if(player!=null&&player.isPlaying()){
            player.stop();
        }
    }

    public void closePlayer(){
        if(player!=null){
            player.release();
            player = null;
        }
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.navigation_song, fragment);
        fragmentTransaction.commit();
    }
}