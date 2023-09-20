package com.cs407.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        textView.setText(result);
    }
}