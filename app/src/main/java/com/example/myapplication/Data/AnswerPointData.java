package com.example.myapplication.Data;
import com.example.myapplication.Enum.QuestionType;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AnswerPointData implements Serializable {
    private int point;
    private String resultText;
    private QuestionType kakusinQuestionType;

}
