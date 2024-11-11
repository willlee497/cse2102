package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @PostMapping("/api/validate/email")
    public ValidationResponse validateEmail(@RequestBody EmailRequest emailRequest) {
        String email = emailRequest.getEmail();
        ValidationResponse response = new ValidationResponse();

        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            response.setValid(true);
            response.setMessage("The email address is valid.");
        } else {
            response.setValid(false);
            response.setMessage("The email address is invalid. Please enter a valid email.");
        }

        return response;
    }

    // Request DTO for email validation
    public static class EmailRequest {
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    // Response DTO for email validation
    public static class ValidationResponse {
        private boolean valid;
        private String message;

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
