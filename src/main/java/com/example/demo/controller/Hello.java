package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class Hello {

    @GetMapping("/hello")
    public String hello(){
        return "Seja bem vindo, ao Spring!";
    }

    @GetMapping("/hello/{nome}")
    public String helloComNome(@PathVariable String nome) {
        return "Olá, " +nome + "!";
    }
    
    
}

//http://localhost:9090/api/hello
