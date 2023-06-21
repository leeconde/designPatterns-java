package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoValor extends Desconto {

    public DescontoParaOrcamentoValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;

    }
}
