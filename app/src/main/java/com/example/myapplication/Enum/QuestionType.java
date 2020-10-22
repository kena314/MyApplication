package com.example.myapplication.Enum;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum QuestionType {
    BUNBUN(      0,10, 0,0,0,0,0,0,0,0,0, "ぶんぶんしますか？"),
    EMOTION_LESS(1,0, 10,0,0,0,0,0,0,0,0, "感情を失いましたか？"),
    FUTURE_HOPE( 2,0, 0,10,0,0,0,0,0,0,0, "将来を期待されていますか?"),
    BLACK_POOP(  3,0, 0,0,10,0,0,0,0,0,0, "ウンコが黒いですか?"),
    ECSTASY(     4,0, 0,0,0,10,0,0,0,0,0, "昇天してる？"),
    CLANNAD_LIFE(5,0, 0,0,0,0,10,0,0,0,0, "クラナドは人生?"),
    OHTANI(      6,0, 0,0,0,0,0,10,0,0,0, "球速165km/sを投げますか?"),
    WOMAN_GORORI(7,0, 0,0,0,0,0,0,10,0,0, "女性ですか？"),
    MOKOU(       8,0, 0,0, 0,0,0,0,0,10,0,"勇気の切断"),
    GORORI(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？");

    private int questionNo;
    private int cookingPoint;
    private int emotionLessPoint;
    private int futurePoint;
    private int blackPoint;
    private int ecstasyPoint;
    private int clannadPoint;
    private int ohtaniPoint;
    private int womanGororiPoint;
    private int mokouPoint;
    private int gororiPoint;

    private String question;

    public static QuestionType toQuestionNo(int questionNo){
        return Arrays.stream(QuestionType.values()).filter(it->it.questionNo == questionNo).findFirst().orElse(null);
    }

}
