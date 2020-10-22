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
    GORORI(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),

    // 10-22
    HAISHIN(     9,0, 0,0,0,0,0,0,0,0,10, "配信者ですか？"),
    GAMER(       9,0, 0,0,0,0,0,0,0,0,10, "ゲーム実況者ですか？"),
    MAN(         9,0, 0,0,0,0,0,0,0,0,10, "男性ですか？"),
    TEEN(        9,0, 0,0,0,0,0,0,0,0,10, "10代ですか？"),
    THIRTEEN(    9,0, 0,0,0,0,0,0,0,0,10, "30歳以上ですか？"),
    REAL(        9,0, 0,0,0,0,0,0,0,0,10, "実在する？"),
    NAME_U(      9,0, 0,0,0,0,0,0,0,0,10, "名前に「う」がつく？"),
    NAME_N(      9,0, 0,0,0,0,0,0,0,0,10, "名前に「ん」がつく？"),
    NAME_KO(     9,0, 0,0,0,0,0,0,0,0,10, "名前に「こ」がつく？"),
    NAME_O(      9,0, 0,0,0,0,0,0,0,0,10, "名前に「お」がつく？"),
    NAME_RI(     9,0, 0,0,0,0,0,0,0,0,10, "名前に「り」がつく？"),
    HIRAGANA(    9,0, 0,0,0,0,0,0,0,0,10, "名前はすべてひらがな？"),
    KATAKANA(    9,0, 0,0,0,0,0,0,0,0,10, "名前はすべてカタカナ？"),
    STUDENT(     9,0, 0,0,0,0,0,0,0,0,10, "学校に通っている？"),
    HOSPITAL(    9,0, 0,0,0,0,0,0,0,0,10, "病院勤務？"),
    WORKER(      9,0, 0,0,0,0,0,0,0,0,10, "働いている？"),
    GAME_RELATION(9,0, 0,0,0,0,0,0,0,0,10, "ゲームに関係する？"),
    YOUTUBER(    9,0, 0,0,0,0,0,0,0,0,10, "Youtubeberですか？"),
    EPHEMERAL(   9,0, 0,0,0,0,0,0,0,0,10, "儚い存在ですか？"),
    DIRTY(       9,0, 0,0,0,0,0,0,0,0,10, "汚れていますか？"),
    HUMAN(       9,0, 0,0,0,0,0,0,0,0,10, "人間ですか？"),
    NICONICO(    9,0, 0,0,0,0,0,0,0,0,10, "ニコニコ動画で有名？"),
    ZOO(         9,0, 0,0,0,0,0,0,0,0,10, "動物？"),
    SMILE(       9,0, 0,0,0,0,0,0,0,0,10, "笑顔ですか？"),
    JOY(         9,0, 0,0,0,0,0,0,0,0,10, "喜怒哀楽の「喜」ですか？"),
    ANGER(       9,0, 0,0,0,0,0,0,0,0,10, "喜怒哀楽の「怒」ですか？"),
    SAD(         9,0, 0,0,0,0,0,0,0,0,10, "喜怒哀楽の「哀」ですか？"),
    FUN(         9,0, 0,0,0,0,0,0,0,0,10, "喜怒哀楽の「楽」ですか？"),
    SPORTS(      9,0, 0,0,0,0,0,0,0,0,10, "運動が得意ですか？"),
    LONG_HAIR(   9,0, 0,0,0,0,0,0,0,0,10, "髪が長いですか？"),
    SHORT_HAIR(  9,0, 0,0,0,0,0,0,0,0,10, "髪が短いですか？");


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

    /*
    * ・配信者ですか？（ゲーム実況者ですか？）
    * ・男性ですか？
    * ・10代ですか？（30歳以上ですか？）
    * ・実在する？
    * ・名前は全て漢字？▲
    * ・名前に「ん」がつく？（文字=う、ん、こ、お、り）
    * ・ひらがな？カタカナ？
    * ・学校に通っている？
    * ・病院勤務？
    * ・働いている？
    * ・ゲームに関係する？
    * ・Youtuberですか？
    * ・儚い存在ですか？（汚れていますか？）
    * ・人間ですか？
    * ・ニコニコ動画で有名？
    * ・動物？（もこう含む）
    * ・笑顔ですか？
    * ・喜怒哀楽の○ですか？（4パターン）
    * ・運動が得意ですか？
    * ・髪が長いですか？（短いですか？）
    * */

    public static QuestionType toQuestionNo(int questionNo){
        return Arrays.stream(QuestionType.values()).filter(it->it.questionNo == questionNo).findFirst().orElse(null);
    }

}
