package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            //Thread.sleep(3000); //대기 초 설정
            startActivity(new Intent(SplashActivity.this, SelectLogSignActivity.class));
            finish();
        } catch (Exception e) {
        }
    }
}


