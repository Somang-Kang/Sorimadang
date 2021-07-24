package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnFocusChangeListener;

public class SignUpActivity extends AppCompatActivity {
    EditText id_input, pw_input, pwCheck_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        id_input=findViewById(R.id.SignUpIDeditText);
        pw_input=findViewById(R.id.SignUpPWeditText);
        pwCheck_input=findViewById(R.id.PWCheckeditText);


    }

    TextView idNotice=findViewById(R.id.SignUpIDNotice);
    TextView pwNotice=findViewById(R.id.SignUpPWNotice);
    TextView pwCheckNotice=findViewById(R.id.PWCheckNotice);

    //
    // String USERID = id_input.getText().toString();
    //String UserPW = pwInput.getText().toString();


    /*
    *1. editText 글자수 최소,최대 제한
    *아이디, 비밀번호 editText의 경우,
    *영문과 숫자를 합쳐서 6자 이상, 15자 이하가 되도록 한다.
    *
    *activity_sign_up.xml에서 maxlength를 15자로 함.
    *
    * 비밀번호 확인 editText의 경우,
    * 비밀번호 editText와 일치하는지 확인해준다.
    *
    *
     */
 //id_input.getText().toString();
    id_input.setOnFocusChangeListener(new OnFocusChangeListener() {
        public void onFocusChange(View v, boolean gainFocus) {
            //포커스가 주어졌을 때 동작
            if (gainFocus) {
                //to do
                //원하는 동작
            }
            //포커스를 잃었을 때의 동작
            else {
                //원하는 동작
            }
        }
    });

    /*
    * 2. 버튼 누르면 edittext의 값 가져옴.
    *  사용자 아이디, 패스워드를 서버와 연결해서 보내주기
    * */
}