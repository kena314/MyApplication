package com.example.myapplication.Enum;

import java.util.Arrays;

public enum QuestionType {
    BUNBUN(      0,10, 0, "ぶんぶんしますか？"),
    EMOTION_LESS(1,0, 10, "感情を失いましたか？"),
    FUTURE_HOPE( 2,0, 10, "将来を期待されていますか?"),
    BLACK_POOP(  3,0, 10, "ウンコが黒いですか?"),
    ECSTASY(     4,0, 10, "昇天してる？"),
    CLANNAD_LIFE(5,0, 10, "クラナドは人生?"),
    OHTANI(      6,0, 10, "球速165km/sを投げますか?"),
    WOMAN_GORORI(7,0, 10, "女性ですか？"),
    MOKOU(       8,0, 10, "勇気の切断？"),
    GORORI(      9,0, 10, "教育番組に出ていますか？");

    private int questionNo;
    private int cookingPoint;
    private int emotionLessPoint;
    private String question;

    private QuestionType(int questionNo, int cookingPoint, int emotionLessPoint, String question) {
        this.questionNo = questionNo;
        this.cookingPoint = cookingPoint;
        this.emotionLessPoint = emotionLessPoint;
        this.question = question;
    }

    public int getQuestionNo(){ return this.questionNo; }

    public int getCookingPoint(){
        return this.cookingPoint;
    }

    public int getEmotionLessPoint(){
        return this.emotionLessPoint;
    }

    public String getQuestion(){ return this.question; }

    public static QuestionType toQuestionNo(int questionNo){
        return Arrays.stream(QuestionType.values()).filter(it->it.questionNo == questionNo).findFirst().orElse(null);
    }

}
