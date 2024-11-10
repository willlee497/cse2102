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

    @GetMapping("/password-check")
    public String showPasswordForm() {
        return "password";  // Looks for password.html in templates folder
    }

    @GetMapping("/email-validation")
    public String showEmailForm() {
        return "email";  // Looks for email.html in templates folder
    }

    @GetMapping("/quiz")
    public String showQuizPage(Model model) {
        return "quiz";  // Looks for quiz.html in templates folder
    }
}
