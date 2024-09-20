package com.example.EsercizioSpring3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/getNome")
    public String getName (@RequestParam(name = "nome") String nome){
        return nome;
    }
    @PostMapping("/postNome")
    public String postNome(@RequestParam(name = "nome") String nome){
        StringBuilder nomeString = new StringBuilder(nome);
        return nomeString.reverse().toString();
    }
}
