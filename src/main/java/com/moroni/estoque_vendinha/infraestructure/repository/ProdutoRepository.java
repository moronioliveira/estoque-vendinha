package com.moroni.estoque_vendinha.infraestructure.repository;

import com.moroni.estoque_vendinha.infraestructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByName(String name);
}
