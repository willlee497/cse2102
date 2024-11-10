package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PasswordController.class)
public class PasswordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnStrongForValidPassword() throws Exception {
        mockMvc.perform(get("/api/password-quality")
                .param("password", "StrongP@ssword123"))
                .andExpect(status().isOk())
                .andExpect(content().string("Strong"));
    }

    @Test
    public void shouldReturnWeakForShortPassword() throws Exception {
        mockMvc.perform(get("/api/password-quality")
                .param("password", "short"))
                .andExpect(status().isOk())
                .andExpect(content().string("Weak"));
    }
}
