package com.example.demo.controller;

import com.example.demo.model.QuizQuestion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
                "What is the name of the plumber character created by Nintendo?",
                new String[]{"Mario", "Luigi", "Wario", "Toad"},
                "Mario"));

        quizQuestions.add(new QuizQuestion(
                "Which video game series features the fictional city of Vice City?",
                new String[]{"Grand Theft Auto", "Saints Row", "Watch Dogs", "Mafia"},
                "Grand Theft Auto"));

        quizQuestions.add(new QuizQuestion(
                "What is the highest level a player can reach in Pac-Man?",
                new String[]{"Level 99", "Level 256", "Level 150", "Level 300"},
                "Level 256"));

        quizQuestions.add(new QuizQuestion(
                "Which game is known for the quote 'War. War never changes.'?",
                new String[]{"Fallout", "Call of Duty", "Battlefield", "Halo"},
                "Fallout"));

        quizQuestions.add(new QuizQuestion(
                "In which game does a character named Geralt hunt monsters for a living?",
                new String[]{"The Witcher", "Dark Souls", "Bloodborne", "Skyrim"},
                "The Witcher"));

        return quizQuestions;
    }
}