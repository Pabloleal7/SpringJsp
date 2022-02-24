package com.example.springboot1.controlador;

import com.example.springboot1.dto.ProdutoDTO;
import com.example.springboot1.entidade.ProdutoEntidade;
import com.example.springboot1.repositorio.ProdutosRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/produtos")
public class ProdutoControlador {

    @GetMapping("/form")
    public String obterFormulario() {
        return "produto-form";
    }

    @GetMapping("/listar")
    public String listar() {

        return "listar-produtos";

    }


    @PostMapping("/cadastrar-produto")
    public RedirectView cadastrarProduto(ProdutoDTO produtoDTO, RedirectAttributes redirectAttributes) {
        System.out.println("Atributo Recebido" + produtoDTO);
//a
        ProdutosRepositorio repositorio = new ProdutosRepositorio();

        ProdutoEntidade produtoEntidade = new ProdutoEntidade(produtoDTO);

        ProdutoEntidade entidadeSalva = repositorio.salvar(produtoEntidade);

        //  model.addAttribute("produtos", repositorio.obterTodos());

        redirectAttributes.addFlashAttribute("produtos", repositorio.obterTodos());

        RedirectView redirectView = new RedirectView("/produtos/listar", true);

        return redirectView;
    }


}
