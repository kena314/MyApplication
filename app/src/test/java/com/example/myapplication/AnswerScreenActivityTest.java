package com.example.myapplication;

import com.example.myapplication.Data.AnswerPoint;
import com.example.myapplication.Enum.QuestionType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AnswerScreenActivityTest {
    private AnswerScreenActivity answerScreenActivity = new AnswerScreenActivity();
    @Test
    public void 現在のポイントで一番高いポイントに対応した質問が取得できること() {
//        準備
        AnswerPoint answerPoint = new AnswerPoint();
        answerPoint.addPoint(QuestionType.EMOTION_LESS);
//        実行
        QuestionType sutQuestionType = answerScreenActivity.getKakusinQuestion(answerPoint);
//        結果
        assertEquals(sutQuestionType,QuestionType.EMOTION_LESS);
    }
}