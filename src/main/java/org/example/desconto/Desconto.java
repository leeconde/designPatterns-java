package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    public abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
