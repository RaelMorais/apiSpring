package br.com.apiprofessores.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Tudo certo por aqui! 🧑‍🏫";
    }
}
