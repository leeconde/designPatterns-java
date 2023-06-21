package org.example.orcamento.situacao;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
