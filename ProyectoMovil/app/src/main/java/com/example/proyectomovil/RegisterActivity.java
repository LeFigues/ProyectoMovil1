package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void onRegisterClicked(){
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtPass = findViewById(R.id.txtPassword);

        String username = txtUser.getText().toString();
        String email = txtEmail.getText().toString();
        String password = txtPass.getText().toString();
        Toast.makeText(this, "Nombre de usuario: " + username +"Email: " + email + ", Contraseña: " + password, Toast.LENGTH_SHORT).show();
    }
}