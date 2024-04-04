package com.senac.esquinaBeer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToMany
    @JoinTable(name="produtos_carrinho", 
        joinColumns = @JoinColumn(name="produtos_fk"),
        inverseJoinColumns = @JoinColumn(name = "carrinho_fk")
    )
    @Fetch(FetchMode.JOIN)
    public List<CarrinhoEntity> carrinhos;
            
    private String nome;
    private String src_img;
    private String categoria;
    private double preco;
    
    @Transient // Indica que este campo não será persistido no banco de dados
    private int quantidade = 1;
}