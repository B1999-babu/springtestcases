package com.example.demo.controller;

import com.example.demo.services.wellcomeservices;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class wellcomecontrollerunittest {

    @Test
    void sholdwellcome(){
        wellcomeservices wellcomeservices= Mockito.mock(wellcomeservices.class);
        when(wellcomeservices.getWellcomeMessage("baburao")).thenReturn("wellcome baburao!");
        wellcomecontroller wellcomecontroller=new wellcomecontroller(wellcomeservices);
        assertEquals("wellcome baburao!",wellcomecontroller.wellcome("baburao"));
    }
}
