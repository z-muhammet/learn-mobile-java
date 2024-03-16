package com.example.hhmmchat;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

public class launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        timer();
    }
    public void timer(){
        CountDownTimer countDownTimer =new CountDownTimer(3000,3000) {

            @Override
            public void onTick(long a){

            }
            @Override
            public void onFinish() {
                Intent i = new Intent(launcher.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        };
        countDownTimer.start();
    }

}