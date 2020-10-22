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
    HAISHIN(     9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    GAMER(       9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    MAN(         9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    TEEN(        9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    THIRTEEN(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    REAL(        9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NAME_U(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NAME_N(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NAME_KO(     9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NAME_O(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NAME_RI(     9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    HIRAGANA(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    KATAKANA(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    STUDENT(     9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    HOSPITAL(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    WORKER(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    GAME_RELATION(9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    YOUTUBER(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    EPHEMERAL(   9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    DIRTY(       9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    HUMAN(       9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    NICONICO(    9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    ZOO(         9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    SMILE(       9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    JOY(         9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    ANGER(       9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    SAD(         9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    FUN(         9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    SPORTS(      9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    LONG_HAIR(   9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？"),
    SHORT_HAIR(  9,0, 0,0,0,0,0,0,0,0,10, "教育番組に出ていますか？");


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
