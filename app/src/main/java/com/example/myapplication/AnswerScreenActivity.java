package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.TextView;

public class AnswerScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String message = getIntent().getStringExtra("message");

        // TextViewへの参照を取得する
        TextView textView = findViewById(R.id.question_text);

        // TextViewにテキストを設定する
        textView.setText(message);
    }
}