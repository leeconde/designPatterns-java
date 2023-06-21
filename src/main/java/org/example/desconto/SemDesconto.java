package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
}
