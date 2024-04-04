package com.senac.esquinaBeer.repository;

import com.senac.esquinaBeer.model.CarrinhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoEntity, Integer> {
   
}
