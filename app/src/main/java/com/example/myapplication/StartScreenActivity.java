package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.start_button);
        Button endButton = findViewById(R.id.end_button);

        // スタートボタン処理
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intentを作成する
                Intent intent = new Intent(StartScreenActivity.this, AnswerScreenActivity.class);

                // 画面を遷移させる
                startActivity(intent);
            }
        });

        // 終了ボタン処理
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // アプリ終了
                moveTaskToBack (true);
            }
        });
    }
}