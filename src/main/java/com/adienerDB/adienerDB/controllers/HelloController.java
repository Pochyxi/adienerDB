package com.adienerDB.adienerDB.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
class HelloController {

    @GetMapping("/")
    public String index() {
        return "IMMOLETTINA PUZZA";
    }

}
