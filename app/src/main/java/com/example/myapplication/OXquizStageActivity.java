package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class OXquizStageActivity extends AppCompatActivity {

    Button OXback,oBT,xBT;
    TextView OXstage,OXstep,OXtime,OXscore, OXquiz, OXpopScore;
    ImageView rightOimg,rightXimg,wrongOimg,wrongXimg;
    LottieAnimationView true_animation, false_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        OXback = findViewById(R.id.backBT);
        oBT = findViewById(R.id.oButton);
        xBT = findViewById(R.id.xButton);

        OXstage = findViewById(R.id.oxStage);
        OXstep = findViewById(R.id.oxQuizStep);
        OXtime = findViewById(R.id.oxTime);
        OXscore = findViewById(R.id.oxScore);
        OXquiz = findViewById(R.id.oxQuiz);
        OXpopScore = findViewById(R.id.oxPopScore);

        rightOimg = findViewById(R.id.rightOimg);
        rightXimg = findViewById(R.id.rigntXimg);
        wrongOimg = findViewById(R.id.wrongOimg);
        wrongXimg = findViewById(R.id.wrongXimg);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxquiz_stage);

        //rightOimg.setVisibility(View.VISIBLE); //화면에서 보이게 하는거->정답일때 보이게 할 수 있음

        true_animation = findViewById(R.id.lottie_true);

        oBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //true_animation.setAnimation("tickgreen.json");
                //true_animation.playAnimation();
                true_animation.setRepeatCount(3);
            }
        });

/*
        false_animation = findViewById(R.id.lottie_false);
        false_animation.setAnimation("signforerrorflatstyle.json");
        false_animation.playAnimation();
        false_animation.setRepeatCount(3);
*/



    }
}
