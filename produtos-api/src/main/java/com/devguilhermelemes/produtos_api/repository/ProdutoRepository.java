package com.devguilhermelemes.produtos_api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguilhermelemes.produtos_api.model.Produto;
import java.util.List;


public interface ProdutoRepository extends JpaRepository <Produto, UUID> {

    List<Produto> findByNome(String id);
}
