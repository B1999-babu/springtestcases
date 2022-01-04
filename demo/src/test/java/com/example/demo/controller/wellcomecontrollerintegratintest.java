package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.equalTo;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class wellcomecontrollerintegratintest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private com.example.demo.services.wellcomeservices wellcomeservices;

    @Test
    void shouldGetDefaultwellcomeMessage() throws Exception {
        when(wellcomeservices.getWellcomeMessage("stranger")).thenReturn("wellcome stranger!");
        mockMvc.perform(get("/wellcome?name=stranger"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("wellcome stranger!")));
                verify(wellcomeservices).getWellcomeMessage("stranger");
        }

    @Test
    void shouldGetCustomwellcomeMessage() throws Exception {
        when(wellcomeservices.getWellcomeMessage("baburao")).thenReturn("wellcome baburao!");
        mockMvc.perform(get("/wellcome?name=baburao"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("wellcome baburao!")));
        verify(wellcomeservices).getWellcomeMessage("baburao");
    }




}

