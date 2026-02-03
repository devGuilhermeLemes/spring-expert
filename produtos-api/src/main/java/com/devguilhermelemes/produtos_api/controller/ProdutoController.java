package com.devguilhermelemes.produtos_api.controller;

// import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devguilhermelemes.produtos_api.model.Produto;
import com.devguilhermelemes.produtos_api.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    // * Injeção de depêndencia
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto Recebido: " + produto);

        // ! Controller não deve ter regra de geração de identidade | Se amanhã você
        // salvar produto em outro fluxo → quebra | Viola SRP (Single Responsibility
        // Principle)
        // var id = UUID.randomUUID().toString(); MÁ PRATICA
        // produto.setId(id); MÁ PRATICA
        // * Deixar o Hibernate gerar UUID automaticamente
        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") UUID id) {
        // Optional<Produto> produto = produtoRepository.findById(id);
        // return produto.isPresent() ? produto.get() : null;

        return produtoRepository.findById(id).orElse(null);
    }
}