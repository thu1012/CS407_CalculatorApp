package com.cs407.calculatorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("DefaultLocale")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int getFirstNum() throws NumberFormatException {
        EditText editText = findViewById(R.id.editTextNumber);
        return Integer.parseInt(editText.getText().toString());
    }

    public int getSecondNum() throws NumberFormatException {
        EditText editText = findViewById(R.id.editTextNumber2);
        return Integer.parseInt(editText.getText().toString());
    }

    public void addition(View view) {
        goToActivity(String.valueOf((double) getFirstNum() + getSecondNum()));
    }

    public void subtraction(View view) {
        goToActivity(String.valueOf((double) getFirstNum() - getSecondNum()));
    }

    public void multiplication(View view) {
        goToActivity(String.valueOf((double) getFirstNum() * getSecondNum()));
    }

    public void division(View view) {
        if (Double.compare(getSecondNum(), 0) == 0) {
            goToActivity("Error: division by zero");
        } else {
            goToActivity(String.format("%.2f", (double) getFirstNum() / getSecondNum()));
        }
    }

    public void goToActivity(String result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}