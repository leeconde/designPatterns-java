package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoQuantidade(
                new DescontoParaOrcamentoValor(
                        new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }
}
