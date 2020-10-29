package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.example.myapplication.Enum.QuestionType;
        import com.example.myapplication.Data.AnswerPoint;
        import com.example.myapplication.Data.QuestionData;

        import java.util.Locale;
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

        QuestionData message = new QuestionData(generateRandomQuestion());

        // TextViewへの参照を取得する
        TextView textView = findViewById(R.id.question_text);

        // テスト用の、現在のポイント表示
        TextView resultPointView = findViewById(R.id.result_point_view);

        // TextViewにテキストを設定する
        textView.setText(message.getQuestionType().getQuestion());

        // 「はい」ボタン処理
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultPointView.setText(String.format(Locale.US,
                        "料理王=%d,無感情=%d,神童=%d\n高校生=%d,サンフランシスコ=%d,号泣=%d\n大谷=%d,元カノゴロリ=%d,もこう=%d,ガチゴロリ=%d\n",
                        answerPoint.getCooking_jun(),answerPoint.getEmotionLess_jun(),answerPoint.getGodChild_jun(),
                        answerPoint.getHighSchool_jun(),answerPoint.getSanFrancisco_jun(),answerPoint.getCry_jun(),
                        answerPoint.getOhtani_jun(),answerPoint.getWomanGorori(),answerPoint.getMokou(),
                        answerPoint.getGorori()));

                // Intentを作成する
                Intent intent = new Intent(AnswerScreenActivity.this, ResultScreenActivity.class);

                // パラメーター設定
                answerPoint.setCooking_jun(message.getQuestionType().getCookingPoint());
                answerPoint.setEmotionLess_jun(message.getQuestionType().getEmotionLessPoint());
                answerPoint.setGodChild_jun(message.getQuestionType().getGodChildPoint());
                answerPoint.setHighSchool_jun(message.getQuestionType().getHighSchoolPoint());
                answerPoint.setSanFrancisco_jun(message.getQuestionType().getSanFranciscoPoint());
                answerPoint.setCry_jun(message.getQuestionType().getCryPoint());
                answerPoint.setOhtani_jun(message.getQuestionType().getOhtaniPoint());
                answerPoint.setWomanGorori(message.getQuestionType().getWomanGororiPoint());
                answerPoint.setMokou(message.getQuestionType().getMokouPoint());
                answerPoint.setGorori(message.getQuestionType().getGororiPoint());

                answerCount++;
                message.setQuestionType(generateRandomQuestion());
                textView.setText(message.getQuestionType().getQuestion());
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
      return QuestionType.toQuestionNo(r.nextInt(10));
    }
}