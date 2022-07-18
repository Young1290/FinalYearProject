package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page3 extends AppCompatActivity {

    private Button buttonLogin;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        buttonLogin = (Button) findViewById(R.id.login);
        buttonRegister = (Button) findViewById(R.id.register);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void openActivity() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}