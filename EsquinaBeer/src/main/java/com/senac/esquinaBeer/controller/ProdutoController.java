package com.senac.esquinaBeer.controller;

import com.senac.esquinaBeer.model.CarrinhoEntity;
import com.senac.esquinaBeer.model.ProdutoEntity;
import com.senac.esquinaBeer.service.CarrinhoService;
import com.senac.esquinaBeer.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdutoController {
    @Autowired 
    ProdutoService produtoService;
    
    @Autowired
    private CarrinhoService carrinhoService;
    
    @GetMapping("/") 
    public String exibirIndex(Model model) { 
        List<ProdutoEntity> produtos = produtoService.listarTodos();
        CarrinhoEntity carrinho = carrinhoService.getCarrinho(); // Obter carrinho atual do usuário
        
        model.addAttribute("carrinho", carrinho);
        model.addAttribute("produtos", produtos);
        
        return "index"; 
    }
    
    @PostMapping("/adicionar")
    public String adicionarAoCarrinho(@RequestParam("produtoId") Integer produtoId) {
        carrinhoService.adicionarProdutoAoCarrinho(produtoId);
        
        return "redirect:/";
    }
    
    @PostMapping("/remover")
    public String removerProduto(@RequestParam("produtoId") Integer produtoId) {
        carrinhoService.removerProdutoDoCarrinho(produtoId);
        
        return "redirect:/";
    }
    
    @PostMapping("/finalizar")
    public String finalizarCompra() {
        carrinhoService.finalizarCompra();
       
        return "redirect:/";
    }

}
