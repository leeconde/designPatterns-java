package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoQuantidade extends Desconto {

    public DescontoParaOrcamentoQuantidade(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
