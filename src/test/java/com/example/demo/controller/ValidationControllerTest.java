package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ValidationController.class)
public class ValidationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnValidForCorrectEmail() throws Exception {
        mockMvc.perform(get("/api/email-validation")
                .param("email", "test@example.com"))
                .andExpect(status().isOk())
                .andExpect(content().string("Valid email"));
    }

    @Test
    public void shouldReturnInvalidForIncorrectEmail() throws Exception {
        mockMvc.perform(get("/api/email-validation")
                .param("email", "invalid-email"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Invalid email"));
    }
}
