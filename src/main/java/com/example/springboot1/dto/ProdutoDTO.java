package com.example.springboot1.dto;

import lombok.Data;

@Data
public class ProdutoDTO {

    private String nome;
    private String descricao;
    private Double valor;
}