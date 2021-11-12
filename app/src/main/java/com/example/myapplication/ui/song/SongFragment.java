package com.example.myapplication.ui.song;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.GwanInstStudyIntro;
import com.example.myapplication.InstrumentQuizResultActivity;
import com.example.myapplication.R;

public class SongFragment extends Fragment implements View.OnClickListener{

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_song,container,false);
        Button ggok = root.findViewById(R.id.ggok_bt);
        Button nil = root.findViewById(R.id.nil_bt);
        Button gang = root.findViewById(R.id.gang_bt);
        Button jin = root.findViewById(R.id.jin_bt);
        Button neo = root.findViewById(R.id.neo_bt);
        Button oh = root.findViewById(R.id.oh_bt);
        Button mong = root.findViewById(R.id.mong_bt);
        Button hae = root.findViewById(R.id.hae_bt);
        Button baet = root.findViewById(R.id.baet_bt);
        Button mil = root.findViewById(R.id.mil_bt);
        ggok.setOnClickListener(this);
        nil.setOnClickListener(this);
        gang.setOnClickListener(this);
        jin.setOnClickListener(this);
        neo.setOnClickListener(this);
        oh.setOnClickListener(this);
        mong.setOnClickListener(this);
        hae.setOnClickListener(this);
        baet.setOnClickListener(this);
        mil.setOnClickListener(this);


        return root;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ggok_bt:
                Intent song_intent1 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent1.putExtra("song_info", 1);
                startActivity(song_intent1);
                break;
            case R.id.nil_bt:
                Intent song_intent2 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent2.putExtra("song_info", 2);
                startActivity(song_intent2);
                break;
            case R.id.gang_bt:
                Intent song_intent3 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent3.putExtra("song_info", 3);
                startActivity(song_intent3);
                break;
            case R.id.jin_bt:
                Intent song_intent4 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent4.putExtra("song_info", 4);
                startActivity(song_intent4);
                break;
            case R.id.neo_bt:
                Intent song_intent5 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent5.putExtra("song_info", 5);
                startActivity(song_intent5);
                break;
            case R.id.oh_bt:
                Intent song_intent6 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent6.putExtra("song_info", 6);
                startActivity(song_intent6);
                break;
            case R.id.mong_bt:
                Intent song_intent7 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent7.putExtra("song_info", 7);
                startActivity(song_intent7);
                break;
            case R.id.hae_bt:
                Intent song_intent8 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent8.putExtra("song_info", 8);
                startActivity(song_intent8);
                break;
            case R.id.baet_bt:
                Intent song_intent9 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent9.putExtra("song_info", 9);
                startActivity(song_intent9);
                break;
            case R.id.mil_bt:
                Intent song_intent10 = new Intent(getActivity(), SongLearningActivity.class);
                song_intent10.putExtra("song_info", 10);
                startActivity(song_intent10);
                break;

        }
    }

}