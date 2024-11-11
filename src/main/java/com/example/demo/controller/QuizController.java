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
                                "What is the largest planet in our solar system?",
                                new String[] { "Earth", "Jupiter", "Mars", "Saturn" },
                                "Jupiter"));

                quizQuestions.add(new QuizQuestion(
                                "Who painted the Mona Lisa?",
                                new String[] { "Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso",
                                                "Claude Monet" },
                                "Leonardo da Vinci"));

                quizQuestions.add(new QuizQuestion(
                                "What is the capital city of Australia?",
                                new String[] { "Sydney", "Melbourne", "Canberra", "Perth" },
                                "Canberra"));

                quizQuestions.add(new QuizQuestion(
                                "Which element has the chemical symbol 'O'?",
                                new String[] { "Oxygen", "Gold", "Osmium", "Oxide" },
                                "Oxygen"));

                quizQuestions.add(new QuizQuestion(
                                "What is the tallest mountain in the world?",
                                new String[] { "K2", "Mount Kilimanjaro", "Mount Everest", "Denali" },
                                "Mount Everest"));

                return quizQuestions;
        }

}