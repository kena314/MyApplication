package com.example.myapplication.test;

import com.example.myapplication.Enum.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class QuestionData {
    private QuestionType questionType;
}
