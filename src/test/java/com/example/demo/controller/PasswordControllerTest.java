package com.example.demo.controller;

import com.example.demo.controller.PasswordController.PasswordRequest;
import com.example.demo.controller.PasswordController.PasswordQualityResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@WebMvcTest(PasswordController.class)
public class PasswordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCheckPasswordQuality_StrongPassword() throws Exception {
        PasswordRequest request = new PasswordRequest();
        request.setPassword("P@ssw0rd123");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/password/check")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.score", is(5)))
                .andExpect(jsonPath("$.quality", is("Strong")))
                .andExpect(jsonPath("$.messages.length()", is(5)));
    }

    @Test
    public void testCheckPasswordQuality_WeakPassword() throws Exception {
        PasswordRequest request = new PasswordRequest();
        request.setPassword("password");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/password/check")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.score", is(2)))
                .andExpect(jsonPath("$.quality", is("Weak")))
                .andExpect(jsonPath("$.messages.length()", is(5)));
    }

    @Test
    public void testCheckPasswordQuality_EmptyPassword() throws Exception {
        PasswordRequest request = new PasswordRequest();
        request.setPassword("");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/password/check")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.score", is(0)))
                .andExpect(jsonPath("$.messages[0]", is("Password length is too short (must be at least 8 characters).")));
    }
}
