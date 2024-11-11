package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";  // Looks for home.html in templates folder
    }

    @GetMapping("/password-checker")
    public String getPasswordCheckerPage() {
        return "password-checker"; // Ensure this matches the HTML file name
    }

    @GetMapping("/email-validator")
    public String getEmailValidatorPage() {
        return "email-validator"; // Ensure this matches the HTML file name
    }

    @GetMapping("/quiz")
    public String showQuizPage(Model model) {
        return "quiz";  // Looks for quiz.html in templates folder
    }
}
