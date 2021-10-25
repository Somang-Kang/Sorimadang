package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.example.myapplication.ui.Instrument.InstrumentFragment.gugakgiApi;

public class TaInstStudyIntro extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta_inst_study_intro);

        img1=findViewById(R.id.T_imageView);
        img2=findViewById(R.id.T_imageView2);
        img3=findViewById(R.id.T_imageView3);
        img4=findViewById(R.id.T_imageView4);
        img5=findViewById(R.id.T_imageView5);
        img6=findViewById(R.id.T_imageView6);
        img7=findViewById(R.id.T_imageView7);
        img8=findViewById(R.id.T_imageView8);

        Glide.with(this).load(gugakgiApi.imgUrlT[0]).override(100,80).into(img1);
        Glide.with(this).load(gugakgiApi.imgUrlT[1]).override(100,80).into(img2);
        Glide.with(this).load(gugakgiApi.imgUrlT[2]).override(100,80).into(img3);
        Glide.with(this).load(gugakgiApi.imgUrlT[3]).override(100,80).into(img4);
        Glide.with(this).load(gugakgiApi.imgUrlT[4]).override(100,80).into(img5);
        Glide.with(this).load(gugakgiApi.imgUrlT[5]).override(100,80).into(img6);
        Glide.with(this).load(gugakgiApi.imgUrlT[6]).override(100,80).into(img7);
        Glide.with(this).load(gugakgiApi.imgUrlT[7]).override(100,80).into(img8);

        t1=findViewById(R.id.T_textView);
        t2=findViewById(R.id.T_textView2);
        t3=findViewById(R.id.T_textView3);
        t4=findViewById(R.id.T_textView4);
        t5=findViewById(R.id.T_textView5);
        t6=findViewById(R.id.T_textView6);
        t7=findViewById(R.id.T_textView7);
        t8=findViewById(R.id.T_textView8);
    }

    public void btnClickTa(View view){
        if(view.getId()==R.id.T_imageView || view.getId()==R.id.T_textView){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t1.getText(),Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent1.putExtra("whatAkgi",1);
            intent1.putExtra("akgi",0);
            startActivity(intent1);
        }else if(view.getId()==R.id.T_imageView2 || view.getId()==R.id.T_textView2){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t2.getText(),Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent2.putExtra("whatAkgi",1);
            intent2.putExtra("akgi",1);
            startActivity(intent2);
        }else if(view.getId()==R.id.T_imageView3 || view.getId()==R.id.T_textView3){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t3.getText(),Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent3.putExtra("whatAkgi",1);
            intent3.putExtra("akgi",2);
            startActivity(intent3);
        }else if(view.getId()==R.id.T_imageView4 || view.getId()==R.id.T_textView4){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t4.getText(),Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent4.putExtra("whatAkgi",1);
            intent4.putExtra("akgi",3);
            startActivity(intent4);
        }else if(view.getId()==R.id.T_imageView5 || view.getId()==R.id.T_textView5){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t5.getText(),Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent5.putExtra("whatAkgi",1);
            intent5.putExtra("akgi",4);
            startActivity(intent5);
        }else if(view.getId()==R.id.T_imageView6 || view.getId()==R.id.T_textView6){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t6.getText(),Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent6.putExtra("whatAkgi",1);
            intent6.putExtra("akgi",5);
            startActivity(intent6);
        }else if(view.getId()==R.id.T_imageView7 || view.getId()==R.id.T_textView7){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t7.getText(),Toast.LENGTH_SHORT).show();
            Intent intent7 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent7.putExtra("whatAkgi",1);
            intent7.putExtra("akgi",6);
            startActivity(intent7);
        }else{
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+t8.getText(),Toast.LENGTH_SHORT).show();
            Intent intent8 = new Intent(TaInstStudyIntro.this, InstStudyActivity.class);
            intent8.putExtra("whatAkgi",1);
            intent8.putExtra("akgi",7);
            startActivity(intent8);
        }
    }

    public void T_instBackActivity(View view) {
        startActivity(new Intent(TaInstStudyIntro.this, InstrumentFragment.class));
    }
}