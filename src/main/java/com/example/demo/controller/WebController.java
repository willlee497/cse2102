package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String getHomePage() {
        return "home"; // Make sure "home.html" is available in the templates folder
    }

    @GetMapping("/email-validator")
    public String getEmailValidatorPage() {
        return "email-validator"; // The HTML template name
    }

    @GetMapping("/password-checker")
    public String getPasswordCheckerPage() {
        return "password-checker"; // The HTML template name
    }

    @GetMapping("/quiz")
    public String getQuizPage() {
        return "quiz"; // The HTML template name
    }
}
