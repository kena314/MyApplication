package com.example.myapplication.Enum;

public enum QuestionType {
    BUNBUN("ぶんぶんしますか？", 0,10, 0),
    EMOTION_LESS("感情を失いましたか？", 1,0, 10),
    FUTURE_HOPE("将来を期待されていますか?", 2,0, 10),
    BLACK_POOP("ウンコが黒いですか?", 3,0, 10),
    ECSTASY("昇天してる？", 4,0, 10),
    CLANNAD_LIFE("クラナドは人生?", 5,0, 10),
    OHTANI("球速165km/sを投げますか?", 6,0, 10),
    WOMAN_GORORI("女性ですか？", 7,0, 10),
    MOKOU("勇気の切断", 8,0, 10),
    GORORI("教育番組に出ていますか？", 9,0, 10);

    private String question;
    private int questionNo;
    private int cookingPoint;
    private int emotionLessPoint;

    private QuestionType(String question, int questionNo, int cookingPoint, int emotionLessPoint) {
        this.question = question;
        this.questionNo = questionNo;
        this.cookingPoint = cookingPoint;
        this.emotionLessPoint = emotionLessPoint;
    }

    public String getQuestion(){
        return this.question;
    }

    public int getCookingPoint(){
        return this.cookingPoint;
    }

    public int getEmotionLessPoint(){
        return this.emotionLessPoint;
    }

    
}
