package com.devguilhermelemes.produtos_api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO - Plain Old Java Object
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;

}
