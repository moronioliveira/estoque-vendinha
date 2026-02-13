package com.moroni.estoque_vendinha.controller;

import com.moroni.estoque_vendinha.business.ProdutoService;
import com.moroni.estoque_vendinha.infraestructure.entity.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/Produtos")
public class ProdutoController {
    private final ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
    Produto produtoSalvo = service.salvarProduto(produto);
    return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos(){
    List<Produto> produtos = service.listarTodos();
    return ResponseEntity.ok(produtos);
    }

}
