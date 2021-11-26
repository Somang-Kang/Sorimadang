package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.example.myapplication.ui.Instrument.InstrumentFragment.gugakgiApi;

public class HyunInstStudyIntro extends AppCompatActivity {

    TextView h1, h2, h3, h4, h5, h6, h7, h8;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyun_inst_study_intro);
        getSupportActionBar().hide();

        img1=findViewById(R.id.H_imageView);
        img2=findViewById(R.id.H_imageView2);
        img3=findViewById(R.id.H_imageView3);
        img4=findViewById(R.id.H_imageView4);
        img5=findViewById(R.id.H_imageView5);
        img6=findViewById(R.id.H_imageView6);
        img7=findViewById(R.id.H_imageView7);
        img8=findViewById(R.id.H_imageView8);

        Glide.with(this).load(gugakgiApi.imgUrlH[0]).override(100,80).into(img1);
        Glide.with(this).load(gugakgiApi.imgUrlH[1]).override(100,80).into(img2);
        Glide.with(this).load(gugakgiApi.imgUrlH[2]).override(100,80).into(img3);
        Glide.with(this).load(gugakgiApi.imgUrlH[3]).override(100,80).into(img4);
        Glide.with(this).load(gugakgiApi.imgUrlH[4]).override(100,80).into(img5);
        Glide.with(this).load(gugakgiApi.imgUrlH[5]).override(100,80).into(img6);
        Glide.with(this).load(gugakgiApi.imgUrlH[6]).override(100,80).into(img7);
        Glide.with(this).load(gugakgiApi.imgUrlH[7]).override(100,80).into(img8);

        h1=findViewById(R.id.H_textView);
        h2=findViewById(R.id.H_textView2);
        h3=findViewById(R.id.H_textView3);
        h4=findViewById(R.id.H_textView4);
        h5=findViewById(R.id.H_textView5);
        h6=findViewById(R.id.H_textView6);
        h7=findViewById(R.id.H_textView7);
        h8=findViewById(R.id.H_textView8);

    }

    public void btnClickHyun(View view){
        if(view.getId()==R.id.H_imageView || view.getId()==R.id.H_textView){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h1.getText(),Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent1.putExtra("whatAkgi",2);
            intent1.putExtra("akgi",0);
            startActivity(intent1);
        }else if(view.getId()==R.id.H_imageView2 || view.getId()==R.id.H_textView2){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h2.getText(),Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent2.putExtra("whatAkgi",2);
            intent2.putExtra("akgi",1);
            startActivity(intent2);
        }else if(view.getId()==R.id.H_imageView3 || view.getId()==R.id.H_textView3){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h3.getText(),Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent3.putExtra("whatAkgi",2);
            intent3.putExtra("akgi",2);
            startActivity(intent3);
        }else if(view.getId()==R.id.H_imageView4 || view.getId()==R.id.H_textView4){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h4.getText(),Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent4.putExtra("whatAkgi",2);
            intent4.putExtra("akgi",3);
            startActivity(intent4);
        }else if(view.getId()==R.id.H_imageView5 || view.getId()==R.id.H_textView5){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h5.getText(),Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent5.putExtra("whatAkgi",2);
            intent5.putExtra("akgi",4);
            startActivity(intent5);
        }else if(view.getId()==R.id.H_imageView6 || view.getId()==R.id.H_textView6){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h6.getText(),Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent6.putExtra("whatAkgi",2);
            intent6.putExtra("akgi",5);
            startActivity(intent6);
        }else if(view.getId()==R.id.H_imageView7 || view.getId()==R.id.H_textView7){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h7.getText(),Toast.LENGTH_SHORT).show();
            Intent intent7 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent7.putExtra("whatAkgi",2);
            intent7.putExtra("akgi",6);
            startActivity(intent7);
        }else{
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+h8.getText(),Toast.LENGTH_SHORT).show();
            Intent intent8 = new Intent(HyunInstStudyIntro.this, InstStudyActivity.class);
            intent8.putExtra("whatAkgi",2);
            intent8.putExtra("akgi",7);
            startActivity(intent8);
        }
    }

    public void H_instBackActivity(View view) {
        startActivity(new Intent(HyunInstStudyIntro.this, InstrumentFragment.class));
    }
}