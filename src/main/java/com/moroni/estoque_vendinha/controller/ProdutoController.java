package com.moroni.estoque_vendinha.controller;

import com.moroni.estoque_vendinha.business.ProdutoService;
import com.moroni.estoque_vendinha.infraestructure.entity.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
