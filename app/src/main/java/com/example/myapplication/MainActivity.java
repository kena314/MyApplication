package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        // ボタンタップ時の処理を指定する
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditTextへの参照を取得する
                EditText editText = findViewById(R.id.editTextTextPersonName2);
                // メッセージを取り出す
                String message = editText.getText().toString();

                // Intentを作成する
                Intent intent = new Intent(ResultActivity);

                // パラメータをセットする
                intent.putExtra("message", message);
                // 画面を遷移させる
                startActivity(intent);
            }
        });
    }
}