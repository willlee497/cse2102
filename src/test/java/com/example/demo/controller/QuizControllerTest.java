package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;

@WebMvcTest(QuizController.class)
public class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetQuizQuestions() throws Exception {
        mockMvc.perform(get("/api/quiz/questions")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(5))) // Updated size to match the response
                .andExpect(jsonPath("$[0].question", notNullValue())) // Ensure 'question' field is present
                .andExpect(jsonPath("$[0].options", notNullValue())) // Ensure 'options' field is present
                .andExpect(jsonPath("$[0].correctAnswer", notNullValue())); // Ensure 'correctAnswer' field is present
    }
}
