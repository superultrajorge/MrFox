package com.example.jorge.mrfox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MrFoxTheme extends AppCompatActivity {
    EditText loggin_email,loggin_pass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_fox_theme);
        loggin_email = (EditText) findViewById(R.id.loggin_email);
        loggin_pass = (EditText) findViewById(R.id.loggin_pass);

    }

    public void registrar (View view){
        Intent i = new Intent(getBaseContext(),Registrar.class);
        startActivity(i);
    }

    public void login1 (View view){
        Intent i = new Intent(this,ScrollingActivity.class);
        startActivity(i);
         }
    }

