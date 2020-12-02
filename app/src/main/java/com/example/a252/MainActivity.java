package com.example.a252;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button signIn;
    EditText loginEditor, passwordEditor;
    final String password = "myPasswordIs12345";
    final String login = "geniusLogin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        signIn = findViewById(R.id.signIn);
        loginEditor = findViewById(R.id.login);
        passwordEditor = findViewById(R.id.password);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String loginField = loginEditor.getText().toString();
        String passwordField = passwordEditor.getText().toString();
        if (login.equals(loginField) && password.equals(passwordField)){
            text.setText(R.string.rightPassword);
        } else {
            text.setText(R.string.wrongPassword);
        }
        loginEditor.setText("");
        passwordEditor.setText("");
    }
}
