package com.example.myapplication.Data;

import com.example.myapplication.Enum.QuestionType;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

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
        cooking_jun = new AnswerPointData(0,"料理王純一",QuestionType.BUNBUN, R.drawable.cuisine);
        emotionLess_jun = new AnswerPointData(0,"無感情純一",QuestionType.EMOTION_LESS, R.drawable.loseemotion);
        godChild_jun = new AnswerPointData(0,"神童純一",QuestionType.FUTURE_HOPE, R.drawable.prodigy);
        highSchool_jun = new AnswerPointData(0,"高校生純一",QuestionType.BLACK_POOP, R.drawable.highschoolstudent);
        sanFrancisco_jun = new AnswerPointData(0,"サンフランシスコで昇天する純一",QuestionType.ECSTASY, R.drawable.sanfrancisco);
        cry_jun = new AnswerPointData(0,"クラナド号泣純一",QuestionType.CLANNAD_LIFE, R.drawable.crying);
        ohtani_jun = new AnswerPointData(0,"大谷純一",QuestionType.OHTANI, R.drawable.ootani);
        womanGorori = new AnswerPointData(0,"元カノゴロリ",QuestionType.WOMAN_GORORI, R.drawable.funkygorori);
        mokou = new AnswerPointData(0,"もこう",QuestionType.MOKOU, R.drawable.mokou);
        gorori = new AnswerPointData(0,"ガチゴロリ",QuestionType.GORORI, R.drawable.mazigorori);

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

    public void minusPoint(QuestionType point){
        this.cooking_jun.setPoint(this.getCooking_jun().getPoint() - point.getCookingPoint());
        this.emotionLess_jun.setPoint(this.getEmotionLess_jun().getPoint() - point.getEmotionLessPoint());
        this.godChild_jun.setPoint(this.getGodChild_jun().getPoint() - point.getGodChildPoint());
        this.highSchool_jun.setPoint(this.getHighSchool_jun().getPoint() - point.getHighSchoolPoint());
        this.sanFrancisco_jun.setPoint(this.getSanFrancisco_jun().getPoint() - point.getSanFranciscoPoint());
        this.cry_jun.setPoint(this.getCry_jun().getPoint() - point.getCryPoint());
        this.ohtani_jun.setPoint(this.getOhtani_jun().getPoint() - point.getOhtaniPoint());
        this.womanGorori.setPoint(this.getWomanGorori().getPoint() - point.getWomanGororiPoint());
        this.mokou.setPoint(this.getMokou().getPoint() - point.getMokouPoint());
        this.gorori.setPoint(this.getGorori().getPoint() - point.getGororiPoint());
    }

    public AnswerPointData serchSaidai(){
        List<AnswerPointData> list = new ArrayList<>();
        list.add(this.cooking_jun);
        list.add(this.emotionLess_jun);
        list.add(this.godChild_jun);
        list.add(this.highSchool_jun);
        list.add(this.sanFrancisco_jun);
        list.add(this.cry_jun);
        list.add(this.ohtani_jun);
        list.add(this.womanGorori);
        list.add(this.mokou);
        list.add(this.gorori);

        return list.stream().max(Comparator.comparing(AnswerPointData::getPoint)).orElse(this.cooking_jun);
    }
}
