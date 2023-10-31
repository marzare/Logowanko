package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText loginInput;
    EditText password;
    String errorMessage = "Złe login lub hasło!";
    TextView errorMessageView;
    Button loginButton;
    String passwordPattern = "12345";
    String[] logins = {"Maciek", "Adam", "BestFriend"};

    protected boolean checkLogin(String login) {
        for(String loginPattern : logins) {
            if(loginPattern.equals(login)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginInput =  findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        errorMessageView = findViewById(R.id.textView);
        loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view){
                if (passwordPattern.equals(password.getText().toString())){
                    startActivity(new Intent(MainActivity.this, MainActivityHello.class));
                } else {
                    errorMessageView.setText(errorMessage);
                }
            }
        });
    }

}