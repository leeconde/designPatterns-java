package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }

}
