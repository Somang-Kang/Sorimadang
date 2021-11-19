package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MinyoGameStage extends AppCompatActivity {

    TextView level_tv;
    TextView game_1;
    TextView game_2;
    TextView game_3;
    TextView egg_intro;
    ImageView egg;
    ImageView broken_egg;
    ImageView pen_1,pen_2,pen_3;
    Button right_ans_bt;
    Button nextlevel_bt;
    private MediaPlayer player;
    private int position = 0;
    String url;
    int rand_num_real,right_number,rand_num1,rand_num2,rand_num3;
    String right_name;
    TextView right_name_tv;
    String ex_name1,ex_name2,ex_name3;
    String[] minyo_name = {"NULL","꼭두각시","닐리리야","꼭두각시","진도아리랑","너영나영","오돌또기","몽금포타령","해주아리랑","뱃노래","밀양아리랑"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minyo_game_stage);
        getSupportActionBar().hide();
        level_tv = findViewById(R.id.nextlevel_bt);
        game_1 = findViewById(R.id.name_1);
        game_2 = findViewById(R.id.name_2);
        game_3 = findViewById(R.id.name_3);
        pen_1 = findViewById(R.id.minyo_pen_1);
        pen_2 = findViewById(R.id.minyo_pen_2);
        pen_3 = findViewById(R.id.minyo_pen_3);
        egg_intro = findViewById(R.id.egg_introduce);
        egg = findViewById(R.id.egg);
        broken_egg = findViewById(R.id.broken_egg);
        right_name_tv = findViewById(R.id.right_name_tv);
        right_ans_bt = findViewById(R.id.see_answer_bt);
        nextlevel_bt = findViewById(R.id.nextlevel_bt);
        /*url[0] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/kkokdugaksi.wav";
        url[1] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/nilliriya.wav";
        url[2] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/Ganggangsullae.wav";
        url[3] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/jindoarirang.wav";
        url[4] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/kkokdugaksi.wav";
        url[5] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/jeju/odolttogi.wav";
        url[6] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/monggeumpotaryeong.wav";
        url[7] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/haejuarirang.wav";
        url[8] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/baennorae.wav";
        url[9] = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/miryangarirang.wav";*/

        Random random = new Random();

        rand_num_real = random.nextInt(10) +1;//정답민요번호
        right_number = random.nextInt(3)+1;//정답문제번호
        rand_num1 = random.nextInt(10) + 1; //문제1 민요번호 랜덤 뽑기

        rand_num2 = rand_num1;
        while(rand_num2 == rand_num1){
            rand_num2 = random.nextInt(10) + 1;//문제2 민요번호 랜덤 뽑기
        }
        rand_num3 = rand_num2;
        while(rand_num3 == rand_num1 || rand_num3 == rand_num2){
            rand_num3 = random.nextInt(10) + 1;//문제3 민요번호 랜덤 뽑기
        }
        ex_name1 = minyo_name[rand_num1]; //문제1 뽑힌 번호의 민요이름 저장
        ex_name2 = minyo_name[rand_num2];//문제2 뽑힌 번호의 민요이름 저장
        ex_name3 = minyo_name[rand_num3];//문제3 뽑힌 번호의 민요이름 저장
        if(rand_num1 == rand_num_real){
            right_number = 1;
        }
        else if(rand_num2 == rand_num_real){
            right_number = 2;
        }
        else if(rand_num3 == rand_num_real){
            right_number = 3;
        }
        else { //정답을 무조건 넣어주는 방법
            ex_name2 = minyo_name[rand_num_real];
            right_number = 2;
        }

        game_1.setText(ex_name1);
        game_2.setText(ex_name2);
        game_3.setText(ex_name3);

        if(rand_num_real == 1){
            right_name= "꼭두각시";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/kkokdugaksi.wav";
        }
        else if(rand_num_real == 2){
            right_name= "닐리리야";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/gyeonggi/nilliriya.wav";
        }
        else if(rand_num_real == 3){
            right_name= "강강술래";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/Ganggangsullae.wav";
        }
        else if(rand_num_real == 4){
            right_name= "진도아리랑";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/namdo/jindoarirang.wav";
        }
        else if(rand_num_real == 5){
            right_name= "너영나영";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/jeju/neoyeongnayeong.wav";

        }
        else if(rand_num_real == 6){
            right_name= "오돌또기";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/jeju/odolttogi.wav";

        }
        else if(rand_num_real == 7){
            right_name= "몽금포타령";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/monggeumpotaryeong.wav";

        }
        else if(rand_num_real == 8){
            right_name= "해주아리랑";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/seodo/haejuarirang.wav";

        }
        else if(rand_num_real == 9){
            right_name= "뱃노래";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/baennorae.wav";

        }
        else if(rand_num_real == 10){
            right_name= "밀양아리랑";
            right_name_tv.setText(right_name);
            url = "https://s3.ap-northeast-2.amazonaws.com/sorimadang.shop/dongbu/miryangarirang.wav";

        }
        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
                egg.setVisibility(View.INVISIBLE);
                broken_egg.setVisibility(View.VISIBLE);
                egg_intro.setText("알을누르면\n노래가 멈춰!");
            }
        });
        broken_egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseAudio();
                broken_egg.setVisibility(View.INVISIBLE);
                egg.setVisibility(View.VISIBLE);
                egg_intro.setText("알을누르면\n노래가 나와!");
            }
        });
        right_ans_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right_name_tv.setVisibility(View.VISIBLE);
                right_name_tv.setText(minyo_name[rand_num_real]);
                nextlevel_bt.setBackgroundColor(Color.parseColor("#EC6767"));
            }
        });

        //egg_intro.setText(minyo_name[rand_num_real]);
        pen_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(right_number == 1){
                    //정답로티
                    Toast.makeText(getApplicationContext(),"정답", Toast.LENGTH_LONG).show();
                }
                else{
                    //오답로티
                    Toast.makeText(getApplicationContext(),"오답", Toast.LENGTH_LONG).show();
                }
            }
        });
        pen_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(right_number == 2){
                    //정답로티
                    Toast.makeText(getApplicationContext(),"정답", Toast.LENGTH_LONG).show();
                }
                else{
                    //오답로티
                    Toast.makeText(getApplicationContext(),"오답", Toast.LENGTH_LONG).show();
                }
            }
        });
        pen_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(right_number == 3){
                    //정답로티
                    Toast.makeText(getApplicationContext(),"정답", Toast.LENGTH_LONG).show();
                }
                else{
                    //오답로티
                    Toast.makeText(getApplicationContext(),"오답", Toast.LENGTH_LONG).show();
                }
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
}