package com.moroni.estoque_vendinha.business;

import com.moroni.estoque_vendinha.infraestructure.entity.Produto;
import com.moroni.estoque_vendinha.infraestructure.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {
private final ProdutoRepository repository;

//Metodo create
public Produto salvarProduto(Produto produto){
    Optional<Produto> produtoExistente = repository.findByName(produto.getName());
    if (produtoExistente.isPresent()){
        throw new RuntimeException("Esse produto já existe");
    }
    return repository.save(produto);
}
}
