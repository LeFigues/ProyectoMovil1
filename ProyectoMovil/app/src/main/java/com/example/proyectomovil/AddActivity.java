package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText etCod;
    EditText etName;
    EditText etPrecio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        etCod= findViewById(R.id.etCod);
        etName= findViewById(R.id.etName);
        etPrecio= findViewById(R.id.etPrecio);
    }
}