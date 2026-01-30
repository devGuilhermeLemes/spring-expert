package com.devguilhermelemes.produtos_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguilhermelemes.produtos_api.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, String> {

}
