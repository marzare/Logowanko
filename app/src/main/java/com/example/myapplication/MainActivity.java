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
    TextView errorMessageView;
    Button loginButton;
    String passwordPattern = "12345";

    @SuppressLint("MissingInflatedId")
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
                    public void OnClick(View view){
                if (passwordPattern.equals(password.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, MainActivityHello.class);
                    startActivities(intent);
                } else {
                    errorMessageView.setText(errorMessage);
                }
            }
        });
    }
}