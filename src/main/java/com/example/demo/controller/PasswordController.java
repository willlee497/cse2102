package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @PostMapping("/check")
    public PasswordQualityResponse checkPasswordQuality(@RequestBody PasswordRequest passwordRequest) {
        String password = passwordRequest.getPassword();
        PasswordQualityResponse response = new PasswordQualityResponse();

        // Password quality evaluation logic
        if (password.length() >= 8) {
            response.getMessages().add("Password length is sufficient.");
            response.setScore(response.getScore() + 1);
        } else {
            response.getMessages().add("Password length is too short (must be at least 8 characters).");
        }

        if (password.matches(".*[A-Z].*")) {
            response.getMessages().add("Password contains an uppercase letter.");
            response.setScore(response.getScore() + 1);
        } else {
            response.getMessages().add("Password should contain at least one uppercase letter.");
        }

        if (password.matches(".*[a-z].*")) {
            response.getMessages().add("Password contains a lowercase letter.");
            response.setScore(response.getScore() + 1);
        } else {
            response.getMessages().add("Password should contain at least one lowercase letter.");
        }

        if (password.matches(".*[0-9].*")) {
            response.getMessages().add("Password contains a number.");
            response.setScore(response.getScore() + 1);
        } else {
            response.getMessages().add("Password should contain at least one number.");
        }

        if (password.matches(".*[^A-Za-z0-9].*")) {
            response.getMessages().add("Password contains a special character.");
            response.setScore(response.getScore() + 1);
        } else {
            response.getMessages().add("Password should contain at least one special character.");
        }

        response.setQuality(response.getScore() >= 4 ? "Strong" : "Weak");
        return response;
    }

    // Request and response DTOs
    static class PasswordRequest {
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    static class PasswordQualityResponse {
        private int score = 0;
        private String quality;
        private List<String> messages = new ArrayList<>();

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public List<String> getMessages() {
            return messages;
        }

        public void setMessages(List<String> messages) {
            this.messages = messages;
        }
    }
}
