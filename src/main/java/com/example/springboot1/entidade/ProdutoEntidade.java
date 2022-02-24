package com.example.springboot1.entidade;

import com.example.springboot1.dto.ProdutoDTO;
import lombok.Data;

@Data
public class ProdutoEntidade {


    private String id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoEntidade(ProdutoDTO produtoDTO) {
        this.setNome(produtoDTO.getNome());
        this.setDescricao(produtoDTO.getDescricao());
        this.setValor(produtoDTO.getValor());
    }

    public ProdutoEntidade() {
    }


}