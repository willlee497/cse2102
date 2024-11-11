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
    public void testGetHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }

    @Test
    public void testGetPasswordCheckerPage() throws Exception {
        mockMvc.perform(get("/password-checker"))
                .andExpect(status().isOk())
                .andExpect(view().name("password-checker"));
    }

    @Test
    public void testGetQuizPage() throws Exception {
        mockMvc.perform(get("/quiz"))
                .andExpect(status().isOk())
                .andExpect(view().name("quiz"));
    }

    @Test
    public void testGetEmailValidatorPage() throws Exception {
        mockMvc.perform(get("/email-validator"))
                .andExpect(status().isOk())
                .andExpect(view().name("email-validator"));
    }
}
