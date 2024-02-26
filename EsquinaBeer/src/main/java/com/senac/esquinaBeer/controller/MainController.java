package com.senac.esquinaBeer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class MainController { 

    @GetMapping("/cadastro") 
    public String exibirIndex(Model model) { 
        // Retorna o nome do template "cadastro" para exibir o formulário 
        return "index"; 
    } 
  
} 

