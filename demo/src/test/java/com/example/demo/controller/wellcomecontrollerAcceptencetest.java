package com.example.demo.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class wellcomecontrollerAcceptencetest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldGetDefaultwellcomeMessage() throws Exception {

        mockMvc.perform(get("/wellcome?name=baburao"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("wellcome baburao!")));

    }

    @Test
    void shouldGetCustomerwellcomeMessage() throws Exception {

        mockMvc.perform(get("/wellcome?name=Yashoda"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("wellcome Yashoda!")));

    }




}
