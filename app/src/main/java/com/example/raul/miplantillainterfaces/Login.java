package com.example.raul.miplantillainterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void register_button (View view){
        Intent i = new Intent(getBaseContext(),Register.class);
        startActivity(i);
    }

    public void login1 (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
