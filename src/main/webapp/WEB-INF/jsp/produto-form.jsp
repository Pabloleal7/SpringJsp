<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de produtos</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</head>
<body>
<fieldset> <legend>Formulário de cadastro de produtos</legend>
    <form action="/app/produtos/cadastrar-produto" method="post">
        <input type="hidden" name="id" value="${produto.id}"/>
        <label>Nome</label> <input type="nome" name="nome" value="${produto.nome}"/>
        <label>Descrição</label> <input type="descricao" name="descricao" value="${produto.descricao}"/>
        <label>Valor</label> <input type="number" name="valor" value="${produto.valor}"/>
        <button>Cadastrar</button>
    </form>
</fieldset>
</body>
</html>