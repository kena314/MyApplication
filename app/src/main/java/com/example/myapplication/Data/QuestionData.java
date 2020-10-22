package com.example.myapplication.Data;

import com.example.myapplication.Enum.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class QuestionData {
    private QuestionType questionType;
}
