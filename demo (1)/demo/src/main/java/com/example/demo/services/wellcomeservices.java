package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class wellcomeservices {
    public String getWellcomeMessage(String name){
        return String.format("wellcome %s!",name);
    }
}
