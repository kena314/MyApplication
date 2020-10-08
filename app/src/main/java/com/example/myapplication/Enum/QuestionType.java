package com.example.myapplication.Enum;

public enum QuestionType {
    BUNBUN("ぶんぶんしますか？", 10, 0),
    EMOTION_LESS("感情を失いましたか？", 0, 10);
    private String question;
    private int cookingPoint;
    private int emotionLessPoint;

    private QuestionType(String question, int cookingPoint, int emotionLessPoint) {
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
