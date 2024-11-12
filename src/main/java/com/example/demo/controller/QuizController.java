package com.example.demo.controller;

import com.example.demo.model.QuizQuestion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping("/questions")
    public List<QuizQuestion> getQuizQuestions() {
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        quizQuestions.add(new QuizQuestion(
                "What is the smallest country in the world by area?",
                new String[]{"Monaco", "Vatican City", "San Marino", "Liechtenstein"},
                "Vatican City"));

        quizQuestions.add(new QuizQuestion(
                "Which element has the chemical symbol 'Au'?",
                new String[]{"Silver", "Oxygen", "Gold", "Argon"},
                "Gold"));

        quizQuestions.add(new QuizQuestion(
                "Who wrote the play 'Romeo and Juliet'?",
                new String[]{"William Shakespeare", "Charles Dickens", "Jane Austen", "Leo Tolstoy"},
                "William Shakespeare"));

        quizQuestions.add(new QuizQuestion(
                "What is the capital city of Canada?",
                new String[]{"Toronto", "Vancouver", "Montreal", "Ottawa"},
                "Ottawa"));

        quizQuestions.add(new QuizQuestion(
                "Which planet is known as the 'Red Planet'?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"},
                "Mars"));

        return quizQuestions;
    }
}
