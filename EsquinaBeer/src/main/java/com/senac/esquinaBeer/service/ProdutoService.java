package com.senac.esquinaBeer.service;

import com.senac.esquinaBeer.model.ProdutoEntity;
import com.senac.esquinaBeer.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoEntity> listarTodos() {
        return produtoRepository.findAll();
    }

    public ProdutoEntity buscarPorId(Integer id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
    }

    public List<ProdutoEntity> findByNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<ProdutoEntity> findByCategoria(String categoria) {
        return produtoRepository.findByCategoriaContainingIgnoreCase(categoria);
    }

    public List<ProdutoEntity> findByPreco(Double preco) {
        return produtoRepository.findByPreco(preco);
    }
}

