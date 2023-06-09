package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onDevelopersClick(){
        Intent intent = new Intent( this, InfoActivity.class);
        startActivity(intent);
    }

    public void onAddClick(){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }
    public void onListClick(){
        Intent intent = new Intent(this, SeeActivity.class);
        startActivity(intent);
    }
    public void onInfoMarket(){
        Intent intent = new Intent(this, InfoMarketActivity.class);
        startActivity(intent);
    }
    public void onRegisterClick(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}