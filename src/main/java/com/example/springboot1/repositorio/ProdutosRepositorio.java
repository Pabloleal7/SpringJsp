package com.example.springboot1.repositorio;

import com.example.springboot1.entidade.ProdutoEntidade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProdutosRepositorio {

    private static List<ProdutoEntidade> lista = new ArrayList<>();


    public ProdutoEntidade salvar(ProdutoEntidade produtoEntidade) {

        String id = UUID.randomUUID().toString();
        produtoEntidade.setId(id);

        lista.add(produtoEntidade);

        return produtoEntidade;
    }

    public List<ProdutoEntidade> obterTodos() {
        return lista;
    }

    public ProdutoEntidade obter(String id) {
        return null;


    }

}
