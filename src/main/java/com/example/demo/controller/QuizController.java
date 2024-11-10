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
                "What is the capital of France?",
                new String[]{"Paris", "London", "Berlin", "Madrid"},
                "Paris"));

        quizQuestions.add(new QuizQuestion(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"},
                "Mars"));

        quizQuestions.add(new QuizQuestion(
                "Who wrote 'To Kill a Mockingbird'?",
                new String[]{"Harper Lee", "George Orwell", "Mark Twain", "Jane Austen"},
                "Harper Lee"));

        return quizQuestions;
    }
}
