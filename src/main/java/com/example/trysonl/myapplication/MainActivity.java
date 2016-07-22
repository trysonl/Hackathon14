package com.example.trysonl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText createUsername;
    private EditText createPassword;
    private EditText confirmPassword;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button logInButton = (Button) findViewById(R.id.login);
        logInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                username = (EditText) findViewById(R.id.username);
                password = (EditText) findViewById(R.id.password);
                setContentView(R.layout.second_page);
                createUsername = (EditText) findViewById(R.id.createUsername);
                createPassword = (EditText) findViewById(R.id.createPassword);
                confirmPassword = (EditText) findViewById(R.id.confirmPassword);
                email = (EditText) findViewById(R.id.createEmail);
                createUsername.setText(username.getText());
                createPassword.setText(password.getText());

                final Button createAccountButton = (Button) findViewById(R.id.createAccountButton);
                createAccountButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        System.out.println(email.getText());
                    }
                });
            }
        });
    }
}
