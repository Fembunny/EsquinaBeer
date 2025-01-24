package com.senac.esquinaBeer.repository;

import com.senac.esquinaBeer.model.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {
    @SuppressWarnings("null")
    Optional<ProdutoEntity> findById(Integer id); // Consulta por ID

    List<ProdutoEntity> findByNomeContainingIgnoreCase(String nome); // Consulta por nome (ignorando maiúsculas/minúsculas) usando JPQL

    List<ProdutoEntity> findByCategoriaContainingIgnoreCase(String categoria); // Consulta por categoria (ignorando maiúsculas/minúsculas) usando JPQL

    List<ProdutoEntity> findByPreco(Double preco); // Consulta por preço usando JPQL
}

