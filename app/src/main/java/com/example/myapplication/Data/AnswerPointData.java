package com.example.myapplication.Data;
import com.example.myapplication.Enum.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AnswerPointData {
    private int point;
    private String resultText;
    private QuestionType kakusinQuestionType;

}
