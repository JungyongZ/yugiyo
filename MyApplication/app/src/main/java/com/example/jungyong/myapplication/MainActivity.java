package com.example.jungyong.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ClickHansik(View view){
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                MyTwo.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);



    }
}
