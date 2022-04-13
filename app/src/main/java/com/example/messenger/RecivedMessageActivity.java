package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecivedMessageActivity extends AppCompatActivity {

    TextView textViewRecivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recived_message);
        textViewRecivedMsg = findViewById(R.id.textViewRecivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewRecivedMsg.setText(msg);
    }
}