package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityHello extends AppCompatActivity {

    EditText textView;
    String login;
    Button logoutButton;
    String helloMessageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hello);

        login = getIntent().getStringExtra("login");
        helloMessageView = findViewById(R.id.textView2);
        helloMessageView.setText("Hello " + login);
        logoutButton = findViewById(R.id.buttonLogout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityHello.this, MainActivity.class);
                startActivity(intent);


            }
        });


    }
}