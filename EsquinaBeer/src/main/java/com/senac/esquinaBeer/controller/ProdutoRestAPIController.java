package com.senac.esquinaBeer.controller;

import com.senac.esquinaBeer.model.ProdutoEntity;
import com.senac.esquinaBeer.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoRestAPIController {
    private final ProdutoService produtoService; 
    
    @Autowired
    public ProdutoRestAPIController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<ProdutoEntity>> listarProdutos(){
        List<ProdutoEntity> produtos = produtoService.listarTodos();
        if (produtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }
}

