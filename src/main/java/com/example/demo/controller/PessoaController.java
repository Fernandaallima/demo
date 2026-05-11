package com.example.demo.controller;

import com.example.demo.model.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PessoaController {

    // ROTA: POST http://localhost:8080/api/pessoa
    @PostMapping("/pessoa")
    public String cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return "Pessoa cadastrada: " + pessoa.nome + " - Idade: " + pessoa.idade;
    }
}