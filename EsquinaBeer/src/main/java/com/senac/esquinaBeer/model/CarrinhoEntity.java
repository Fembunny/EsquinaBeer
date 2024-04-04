package com.senac.esquinaBeer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Carrinho")
public class CarrinhoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToMany(mappedBy = "carrinhos")
    public List<ProdutoEntity> produtos =  new ArrayList<>();
    
    private int quantidadeTotal;
    private double valorTotal;

    public void limparCarrinho() {
        this.produtos.clear();
        this.quantidadeTotal = 0;
        this.valorTotal = 0.0;
    }
}