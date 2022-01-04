package com.example.demo.controller;

import com.example.demo.services.wellcomeservices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class wellcomecontroller {
    private com.example.demo.services.wellcomeservices wellcomeservices;
    public wellcomecontroller(wellcomeservices wellcomeservices){
        this.wellcomeservices=wellcomeservices;
    }

     @GetMapping("/wellcome")
    public String wellcome(@RequestParam(defaultValue = "Stranger") String name){
        return wellcomeservices.getWellcomeMessage(name);
    }

}
