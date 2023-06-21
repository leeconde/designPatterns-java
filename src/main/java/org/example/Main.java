package org.example;

import org.example.pedido.GeraPedido;
import org.example.pedido.GerarPedidoHandler;
import org.example.pedido.acao.EnviarEmailPedido;
import org.example.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valor = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valor, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.execute(gerador);
    }
}