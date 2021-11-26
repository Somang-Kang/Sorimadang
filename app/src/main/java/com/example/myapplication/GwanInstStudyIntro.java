package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.myapplication.ui.Instrument.InstrumentFragment;
import com.example.myapplication.ui.Instrument.InstrumentFragment.gugakgiApi;

public class GwanInstStudyIntro extends AppCompatActivity {

    TextView g1, g2, g3, g4, g5, g6, g7, g8, g9, g10,g11, g12, g13, g14;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14;
    //public static gugakgiApi gugakgiAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwan_inst_study_intro);
        getSupportActionBar().hide();

        img1=findViewById(R.id.G_imageView);
        img2=findViewById(R.id.G_imageView2);
        img3=findViewById(R.id.G_imageView3);
        img4=findViewById(R.id.G_imageView4);
        img5=findViewById(R.id.G_imageView5);
        img6=findViewById(R.id.G_imageView6);
        img7=findViewById(R.id.G_imageView7);
        img8=findViewById(R.id.G_imageView8);
        img9=findViewById(R.id.G_imageView9);
        img10=findViewById(R.id.G_imageView10);
        img11=findViewById(R.id.G_imageView11);
        img12=findViewById(R.id.G_imageView12);
        img13=findViewById(R.id.G_imageView13);
        img14=findViewById(R.id.G_imageView14);

        Glide.with(this).load(gugakgiApi.imgUrlG[0]).override(100,80).into(img1);
        Glide.with(this).load(gugakgiApi.imgUrlG[1]).override(100,80).into(img2);
        Glide.with(this).load(gugakgiApi.imgUrlG[2]).override(100,80).into(img3);
        Glide.with(this).load(gugakgiApi.imgUrlG[3]).override(100,80).into(img4);
        Glide.with(this).load(gugakgiApi.imgUrlG[4]).override(100,80).into(img5);
        Glide.with(this).load(gugakgiApi.imgUrlG[5]).override(100,80).into(img6);
        Glide.with(this).load(gugakgiApi.imgUrlG[6]).override(100,80).into(img7);
        Glide.with(this).load(gugakgiApi.imgUrlG[7]).override(100,80).into(img8);
        Glide.with(this).load(gugakgiApi.imgUrlG[8]).override(100,80).into(img9);
        Glide.with(this).load(gugakgiApi.imgUrlG[9]).override(100,80).into(img10);
        Glide.with(this).load(gugakgiApi.imgUrlG[10]).override(100,80).into(img11);
        Glide.with(this).load(gugakgiApi.imgUrlG[11]).override(100,80).into(img12);
        Glide.with(this).load(gugakgiApi.imgUrlG[12]).override(100,80).into(img13);
        Glide.with(this).load(gugakgiApi.imgUrlG[13]).override(100,80).into(img14);

        g1=findViewById(R.id.G_textView);
        g2=findViewById(R.id.G_textView2);
        g3=findViewById(R.id.G_textView3);
        g4=findViewById(R.id.G_textView4);
        g5=findViewById(R.id.G_textView5);
        g6=findViewById(R.id.G_textView6);
        g7=findViewById(R.id.G_textView7);
        g8=findViewById(R.id.G_textView8);
        g9=findViewById(R.id.G_textView9);
        g10=findViewById(R.id.G_textView10);
        g11=findViewById(R.id.G_textView11);
        g12=findViewById(R.id.G_textView12);
        g13=findViewById(R.id.G_textView13);
        g14=findViewById(R.id.G_textView14);

    }

    public void btnClickGwan(View view){
        if(view.getId()==R.id.G_imageView || view.getId()==R.id.G_textView){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g1.getText(),Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent1.putExtra("whatAkgi",1);
            intent1.putExtra("akgi",0);
            startActivity(intent1);
        }else if(view.getId()==R.id.G_imageView2 || view.getId()==R.id.G_textView2){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g2.getText(),Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent2.putExtra("whatAkgi",1);
            intent2.putExtra("akgi",1);
            startActivity(intent2);
        }else if(view.getId()==R.id.G_imageView3 || view.getId()==R.id.G_textView3){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g3.getText(),Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent3.putExtra("whatAkgi",1);
            intent3.putExtra("akgi",2);
            startActivity(intent3);
        }else if(view.getId()==R.id.G_imageView4 || view.getId()==R.id.G_textView4){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g4.getText(),Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent4.putExtra("whatAkgi",1);
            intent4.putExtra("akgi",3);
            startActivity(intent4);
        }else if(view.getId()==R.id.G_imageView5 || view.getId()==R.id.G_textView5){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g5.getText(),Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent5.putExtra("whatAkgi",1);
            intent5.putExtra("akgi",4);
            startActivity(intent5);
        }else if(view.getId()==R.id.G_imageView6 || view.getId()==R.id.G_textView6){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g6.getText(),Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent6.putExtra("whatAkgi",1);
            intent6.putExtra("akgi",5);
            startActivity(intent6);
        }else if(view.getId()==R.id.G_imageView7 || view.getId()==R.id.G_textView7){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g7.getText(),Toast.LENGTH_SHORT).show();
            Intent intent7 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent7.putExtra("whatAkgi",1);
            intent7.putExtra("akgi",6);
            startActivity(intent7);
        }else if(view.getId()==R.id.G_imageView8 || view.getId()==R.id.G_textView8){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g8.getText(),Toast.LENGTH_SHORT).show();
            Intent intent8 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent8.putExtra("whatAkgi",1);
            intent8.putExtra("akgi",7);
            startActivity(intent8);
        }else if(view.getId()==R.id.G_imageView9 || view.getId()==R.id.G_textView9){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g9.getText(),Toast.LENGTH_SHORT).show();
            Intent intent9 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent9.putExtra("whatAkgi",1);
            intent9.putExtra("akgi",8);
            startActivity(intent9);
        }else if(view.getId()==R.id.G_imageView10 || view.getId()==R.id.G_textView10){
            //Toast.makeText(getApplicationContext(), "버튼 눌림"+g10.getText(),Toast.LENGTH_SHORT).show();
            Intent intent10 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent10.putExtra("whatAkgi",1);
            intent10.putExtra("akgi",9);
            startActivity(intent10);
        }else if(view.getId()==R.id.G_imageView11 || view.getId()==R.id.G_textView11){
            //Toast.makeText(getApplicationContext(), "버튼 눌림 "+g11.getText(),Toast.LENGTH_SHORT).show();
            Intent intent11 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent11.putExtra("whatAkgi",1);
            intent11.putExtra("akgi",10);
            startActivity(intent11);
        }else if(view.getId()==R.id.G_imageView12 || view.getId()==R.id.G_textView12){
            //Toast.makeText(getApplicationContext(), "버튼 눌림 "+g12.getText(),Toast.LENGTH_SHORT).show();
            Intent intent12 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent12.putExtra("whatAkgi",1);
            intent12.putExtra("akgi",11);
            startActivity(intent12);
        }else if(view.getId()==R.id.G_imageView13 || view.getId()==R.id.G_textView13){
            //Toast.makeText(getApplicationContext(), "버튼 눌림 "+g13.getText(),Toast.LENGTH_SHORT).show();
            Intent intent13 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent13.putExtra("whatAkgi",1);
            intent13.putExtra("akgi",12);
            startActivity(intent13);
        }else{
            //Toast.makeText(getApplicationContext(), "버튼 눌림 "+g14.getText(),Toast.LENGTH_SHORT).show();
            Intent intent14 = new Intent(GwanInstStudyIntro.this, InstStudyActivity.class);
            intent14.putExtra("whatAkgi",1);
            intent14.putExtra("akgi",13);
            startActivity(intent14);
        }
    }

    public void G_instbackActivity(View view) {
        startActivity(new Intent(GwanInstStudyIntro.this, InstrumentFragment.class));
    }
}