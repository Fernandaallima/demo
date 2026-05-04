package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculadoraController {

    //@GetMapping("/somar") -  @RequestParam
    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 + num2;
        return "O resultado de " + num1 + " + " + num2 + " é " + resultado + ".";
    }

    @GetMapping("/subtrair/{num1}/{num2}")
    public String subtrair(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 - num2;
        return "O resultado de " + num1 + " - " + num2 + " é " + resultado + ".";
    }

     @GetMapping("/multiplicar/{num1}/{num2}")
    public String multiplicar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 * num2;
        return "O resultado de " + num1 + " * " + num2 + " é " + resultado + ".";
    }

    @GetMapping("/dividir/{num1}/{num2}")
    public String dividir(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            return "Erro: não é possível dividir por zero!";
        }       
        double resultado = num1 / num2;
            return "O resultado de " + num1 + " / " + num2 + " é " + resultado + ".";
    }
}