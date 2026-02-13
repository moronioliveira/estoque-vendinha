package com.moroni.estoque_vendinha.business;

import com.moroni.estoque_vendinha.infraestructure.entity.Produto;
import com.moroni.estoque_vendinha.infraestructure.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
    //Metodo read
    public List<Produto> listarTodos(){
    return repository.findAll();
    }

    //Metodo update
    public Produto atualizar (Long id, Produto produtoAtualizado){
    Produto produtoExistente = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    produtoExistente.setId(produtoAtualizado.getId());
    produtoExistente.setName(produtoAtualizado.getName());
    produtoExistente.setPrice(produtoAtualizado.getPrice());
    produtoExistente.setStockeQuantity(produtoAtualizado.getStockeQuantity());
    return repository.save(produtoExistente);
    }
}
