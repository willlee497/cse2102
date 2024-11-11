package com.example.demo.controller;

import com.example.demo.controller.ValidationController.EmailRequest;
import com.example.demo.controller.ValidationController.ValidationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@WebMvcTest(ValidationController.class)
public class ValidationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testValidateEmail_ValidEmail() throws Exception {
        EmailRequest request = new EmailRequest();
        request.setEmail("test@example.com");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/validate/email")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.valid", is(true)))
                .andExpect(jsonPath("$.message", is("The email address is valid.")));
    }

    @Test
    public void testValidateEmail_InvalidEmail() throws Exception {
        EmailRequest request = new EmailRequest();
        request.setEmail("invalid-email");

        mockMvc.perform(MockMvcRequestBuilders.post("/api/validate/email")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.valid", is(false)))
                .andExpect(jsonPath("$.message", is("The email address is invalid. Please enter a valid email.")));
    }
}
