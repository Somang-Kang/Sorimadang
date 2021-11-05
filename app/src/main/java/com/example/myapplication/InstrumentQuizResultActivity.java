package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstrumentQuizResultActivity extends AppCompatActivity {

    int stage;
    int result;
    TextView right_ans_view;
    TextView stage_ans_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument_quiz_result);

        getSupportActionBar().hide();

        Intent receive_intent = getIntent();

        stage = receive_intent.getIntExtra("stage",0);
        result = receive_intent.getIntExtra("right_ans",0);

        right_ans_view = findViewById(R.id.right_num);
        stage_ans_view = findViewById(R.id.stage_nums);

        right_ans_view.setText(Integer.toString(result));
        if(stage == 1){
            stage_ans_view.setText("3");
        }
        else if(stage == 2){
            stage_ans_view.setText("4");
        }
        else{
            stage_ans_view.setText("5");
        }


    }

    public void replayButton(View view) {
        startActivity(new Intent(InstrumentQuizResultActivity.this, InstrumentQuizIntroActivity.class));
    }
}