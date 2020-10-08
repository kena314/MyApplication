package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class AnswerScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        Button yesButton = findViewById(R.id.yes_button);

        //String message = getIntent().getStringExtra("message");
        String message = "ぶんぶんしますか？ ";

        // TextViewへの参照を取得する
        TextView textView = findViewById(R.id.question_text);

        // TextViewにテキストを設定する
        textView.setText(message);

        // 「はい」ボタン処理
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intentを作成する
                Intent intent = new Intent(AnswerScreenActivity.this, ResultScreenActivity.class);

                if (message.equals("ぶんぶんしますか？ ")) {

                    // 画面を遷移させる
                    startActivity(intent);
                }
            }
        });
    }
}