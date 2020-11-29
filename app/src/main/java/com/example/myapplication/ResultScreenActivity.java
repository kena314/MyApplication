package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.Data.AnswerPointData;

public class ResultScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        AnswerPointData Ap = (AnswerPointData)getIntent().getSerializableExtra("Result");
        TextView textView = findViewById(R.id.result_text);
        textView.setText(Ap.getResultText());
    }
}