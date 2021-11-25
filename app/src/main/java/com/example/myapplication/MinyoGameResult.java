package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.ui.Instrument.InstrumentFragment;

public class MinyoGameResult extends AppCompatActivity {

    TextView correct, wrong; // 맞은 개수, 틀린 개수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minyo_game_result);

        correct = findViewById(R.id.correct);
        wrong = findViewById(R.id.wrong);


    }

    public void replayMinyoGame(View view) {
        startActivity(new Intent(MinyoGameResult.this, MinyoGameIntro.class));
    }
}