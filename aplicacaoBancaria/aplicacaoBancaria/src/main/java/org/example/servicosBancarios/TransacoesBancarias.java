package org.example.servicosBancarios;

import org.example.exception.SaldoInsuficienteException;
import org.example.exception.ValorMaiorZeroException;
import org.example.servicosBancarios.Aplicacao;
import org.example.servicosBancarios.Financiamento;
import org.example.servicosBancarios.Transacao;

import java.util.Date;

public interface TransacoesBancarias {

    Double pagar (Double valor) throws ValorMaiorZeroException, SaldoInsuficienteException;

    Double depositar (Double valor) throws ValorMaiorZeroException;

    Double investir(Aplicacao aplicacao, Double valorInvestido);

    Double financiar(Financiamento financiamento, Double valorFinanciamento);

    void registrarTransacao(Transacao transacao);

    void verificarExtratoPorPeriodo(Date dataInicio, Date dataFim);
}
