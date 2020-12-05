package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
        ImageView imageView = findViewById(R.id.result_image);
        imageView.setImageResource(Ap.getImageId());


        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Intentを作成する
                Intent intent = new Intent(ResultScreenActivity.this, StartScreenActivity.class);

                // 画面を遷移させる
                startActivity(intent);
            }
        });




    }
}