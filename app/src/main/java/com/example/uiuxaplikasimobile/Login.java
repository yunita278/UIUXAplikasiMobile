package com.example.uiuxaplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        Intent intent = new Intent(Login.this, Register.class);
        startActivity(intent);
    }

    public void tampil(View view) {
        Intent intent2 = new Intent(Login.this, Dasboard.class);
        startActivity(intent2);
    }

    public void Lupa(View view) {
        Intent intent3 = new Intent(Login.this, Lupa_Password.class);
        startActivity(intent3);
    }
}