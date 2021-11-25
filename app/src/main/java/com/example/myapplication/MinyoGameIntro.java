package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MinyoGameIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minyo_game_intro);
    }

    public void instMinyoActivity(View view) {
        Intent intent = new Intent(MinyoGameIntro.this, MinyoGameStage.class);
        startActivity(intent);
    }

    public void instMinyoBackActivity(View view) {
        Intent intent = new Intent(MinyoGameIntro.this, MainActivity.class);
        startActivity(intent);
    }
}