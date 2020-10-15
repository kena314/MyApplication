package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.example.myapplication.Enum.QuestionType;
        import com.example.myapplication.test.AnswerPoint;

        import java.util.Random;

public class AnswerScreenActivity extends AppCompatActivity {

    // インスタンス作成
    AnswerPoint answerPoint = new AnswerPoint();
    // 質問回数
    Random rnd = new Random();
    Integer questionCount = 11 + rnd.nextInt(10);
    // 回答回数
    int answerCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        Button yesButton = findViewById(R.id.yes_button);

        //String message = getIntent().getStringExtra("message");
        QuestionType message = QuestionType.BUNBUN;

        // TextViewへの参照を取得する
        TextView textView = findViewById(R.id.question_text);

        // TextViewにテキストを設定する
        textView.setText(message.getQuestion());

        // 「はい」ボタン処理
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intentを作成する
                Intent intent = new Intent(AnswerScreenActivity.this, ResultScreenActivity.class);

                // パラメーター設定
                answerPoint.setCooking_jun(message.getCookingPoint());
                answerPoint.setEmotionLess_jun(message.getEmotionLessPoint());
                answerCount++;
                if (questionCount == answerCount){
                    // 画面を遷移させる
                    startActivity(intent);
                }
            }
        });
    }
    //
    private QuestionType generateRandomQuestion(){
      Random r = new Random();


    }
}