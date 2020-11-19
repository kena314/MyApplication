package com.example.myapplication.Data;

import com.example.myapplication.Enum.QuestionType;

import lombok.Data;

@Data
public class AnswerPoint {

    //料理王純一
    private AnswerPointData cooking_jun;
    //無感情純一
    private AnswerPointData emotionLess_jun;
    //神童純一
    private AnswerPointData godChild_jun;
    //高校生純一
    private AnswerPointData highSchool_jun;
    //サンフランシスコで昇天する純一
    private AnswerPointData sanFrancisco_jun;
    //クラナド号泣純一
    private AnswerPointData cry_jun;
    //大谷純一
    private AnswerPointData ohtani_jun;
    //元カノゴロリ
    private AnswerPointData womanGorori;
    //もこう
    private AnswerPointData mokou;
    //ガチゴロリ
    private AnswerPointData gorori;

    public AnswerPoint () {
        cooking_jun = new AnswerPointData(0,QuestionType.BUNBUN);
        emotionLess_jun = new AnswerPointData(0,QuestionType.EMOTION_LESS);
        godChild_jun = new AnswerPointData(0,QuestionType.FUTURE_HOPE);
        highSchool_jun = new AnswerPointData(0,QuestionType.BLACK_POOP);
        sanFrancisco_jun = new AnswerPointData(0,QuestionType.ECSTASY);
        cry_jun = new AnswerPointData(0,QuestionType.CLANNAD_LIFE);
        ohtani_jun = new AnswerPointData(0,QuestionType.OHTANI);
        womanGorori = new AnswerPointData(0,QuestionType.WOMAN_GORORI);
        mokou = new AnswerPointData(0,QuestionType.MOKOU);
        gorori = new AnswerPointData(0,QuestionType.GORORI);

    }

    public void addPoint(QuestionType point){
        this.cooking_jun.setPoint(this.getCooking_jun().getPoint() + point.getCookingPoint());
        this.emotionLess_jun.setPoint(this.getEmotionLess_jun().getPoint() + point.getEmotionLessPoint());
        this.godChild_jun.setPoint(this.getGodChild_jun().getPoint() + point.getGodChildPoint());
        this.highSchool_jun.setPoint(this.getHighSchool_jun().getPoint() + point.getHighSchoolPoint());
        this.sanFrancisco_jun.setPoint(this.getSanFrancisco_jun().getPoint() + point.getSanFranciscoPoint());
        this.cry_jun.setPoint(this.getCry_jun().getPoint() + point.getCryPoint());
        this.ohtani_jun.setPoint(this.getOhtani_jun().getPoint() + point.getOhtaniPoint());
        this.womanGorori.setPoint(this.getWomanGorori().getPoint() + point.getWomanGororiPoint());
        this.mokou.setPoint(this.getMokou().getPoint() + point.getMokouPoint());
        this.gorori.setPoint(this.getGorori().getPoint() + point.getGororiPoint());
    }
}
