package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    ProgressBar pb;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prog();
        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashActivity.this, RegisterActivity.class );
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }

    public void prog(){
        pb=(ProgressBar) findViewById(R.id.pb);
        final Timer t= new Timer();
        TimerTask tt= new TimerTask() {
            @Override
            public void run() {
                counter = counter+2;
                pb.setProgress(counter);
                if(counter==100)
                    t.cancel();
            }
        };
        t.schedule(tt, 0, 100);
    }
}