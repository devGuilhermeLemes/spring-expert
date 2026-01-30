package com.devguilhermelemes.produtos_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO - Plain Old Java Object
@Entity
@Table(name = "produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    @Id
    private String id;
    
    private String nome;
    private String descricao;
    private Double preco;

}
