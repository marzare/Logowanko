package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String errorMessage = "Złe login lub hasło!";
    TextView errorMessageView;

    public String dobrehaslo = "12";
    public String dobrylogin = "we";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        errorMessageView = findViewById(R.id.textView);

        Button button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            EditText log = (EditText)findViewById(R.id.editTextText);
            String loginwpisany = log.getText().toString();
            EditText hass = (EditText)findViewById(R.id.editTextTextPassword);
            String haslowpisane = hass.getText().toString();


            @Override
                public void onClick(View v) {
                    if (dobrylogin.equals(loginwpisany) && dobrehaslo.equals(haslowpisane)) {
                        startActivity(new Intent(MainActivity.this, MainActivityHello.class));
                    } else {
                        errorMessageView.setText(errorMessage);
                    }

                }
        });
    }

}