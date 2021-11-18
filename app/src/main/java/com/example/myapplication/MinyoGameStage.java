package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MinyoGameStage extends AppCompatActivity {

    TextView level_tv;
    TextView game_1;
    TextView game_2;
    TextView game_3;
    TextView egg_intro;
    ImageView egg;
    ImageView broken_egg;
    private MediaPlayer player;
    private int position = 0;
    String url;
    int rand_num_real,right_number,rand_num1,rand_num2,rand_num3;
    String right_name;
    TextView right_name_tv;
    String names[];
    String minyo_name[] = {"꼭두각시","닐리리야","꼭두각시","진도아리랑","너영나영","오돌또기","몽금포타령","해주아리랑","뱃노래","밀양아리랑"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minyo_game_stage);

        level_tv = findViewById(R.id.nextlevel_bt);
        game_1 = findViewById(R.id.name_1);
        game_2 = findViewById(R.id.name_2);
        game_3 = findViewById(R.id.name_3);
        egg_intro = findViewById(R.id.egg_introduce);
        egg = findViewById(R.id.egg);
        broken_egg = findViewById(R.id.broken_egg);
        right_name_tv = findViewById(R.id.right_name_tv);
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

        rand_num_real = random.nextInt(10) +1;//민요번호
        right_number = random.nextInt(3)+1;//문제번호
        rand_num1 = random.nextInt(10) + 1;
        rand_num2 = rand_num1;
        while(rand_num2 == rand_num1){
            rand_num2 = random.nextInt(10) + 1;
        }
        rand_num3 = rand_num2;
        while(rand_num3 == rand_num1 || rand_num3 == rand_num2){
            rand_num3 = random.nextInt(10) + 1;
        }
        names[0] = minyo_name[rand_num1];
        names[1] = minyo_name[rand_num2];
        names[2] = minyo_name[rand_num3];
        if(rand_num1 != rand_num_real && rand_num2 != rand_num_real && rand_num3 != rand_num_real){
            names[1] = minyo_name[right_number];
        } //정답을 무조건 넣어주는 방법

        game_1.setText(names[0]);
        game_2.setText(names[1]);
        game_3.setText(names[2]);

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
            right_name= "꼭두각시";
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