package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(WebController.class)
public class WebControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldShowHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }

    @Test
    public void shouldShowPasswordCheckPage() throws Exception {
        mockMvc.perform(get("/password-check"))
                .andExpect(status().isOk())
                .andExpect(view().name("password"));
    }

    @Test
    public void shouldShowEmailValidationPage() throws Exception {
        mockMvc.perform(get("/email-validation"))
                .andExpect(status().isOk())
                .andExpect(view().name("email"));
    }

    @Test
    public void shouldShowQuizPage() throws Exception {
        mockMvc.perform(get("/quiz"))
                .andExpect(status().isOk())
                .andExpect(view().name("quiz"));
    }
}
