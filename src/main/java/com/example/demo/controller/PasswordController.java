package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @GetMapping("/api/password-quality")
    public ResponseEntity<String> checkPasswordQuality(@RequestParam String password) {
        String message = evaluatePasswordQuality(password);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    private String evaluatePasswordQuality(String password) {
        int lengthScore = password.length() >= 8 ? 1 : 0;
        int uppercaseScore = password.matches(".*[A-Z].*") ? 1 : 0;
        int lowercaseScore = password.matches(".*[a-z].*") ? 1 : 0;
        int numberScore = password.matches(".*[0-9].*") ? 1 : 0;
        int specialCharScore = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*") ? 1 : 0;

        int score = lengthScore + uppercaseScore + lowercaseScore + numberScore + specialCharScore;

        switch (score) {
            case 5:
                return "Strong";
            case 3:
            case 4:
                return "Moderate";
            default:
                return "Weak";
        }
    }
}
