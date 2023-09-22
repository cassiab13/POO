package org.example.conta;

import org.example.cliente.Cliente;
import org.example.exception.SaldoInsuficienteException;
import org.example.exception.ValorMaiorZeroException;
import org.example.servicosBancarios.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ContaCorrente extends Conta implements TransacoesBancarias {

    private List<Transacao> transacoes;

    public ContaCorrente(TipoConta tipoConta,Integer numeroConta, Double saldo, Cliente titular)
    {
       super(tipoConta, numeroConta, saldo, titular);
       this.transacoes = new ArrayList<>();
    }

    @Override
    public Double pagar(Double valor) {
        try {
            if (valor <= 0) {
                throw new ValorMaiorZeroException();
            } else if (valor > getSaldo()) {
                throw new SaldoInsuficienteException();
            }
            Transacao transacao = new Transacao(new Date(), TipoTransacao.PAGAMENTO, valor);
            registrarTransacao(transacao);
            setSaldo (getSaldo()-valor);
            return getSaldo();
        } catch (ValorMaiorZeroException | SaldoInsuficienteException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return getSaldo();
        }
    }

    @Override
    public Double depositar(Double valor) {
        try {
            if (valor <= 0)
                throw new ValorMaiorZeroException();
            Transacao transacao = new Transacao(new Date(), TipoTransacao.DEPOSITO, valor);
            registrarTransacao(transacao);
            setSaldo (getSaldo()+valor);
            return getSaldo();
        } catch (ValorMaiorZeroException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return getSaldo();
        }
    }

    @Override
    public Double investir(Aplicacao aplicacao, Double valorInvestido) {
        Transacao transacao = new Transacao(new Date(), TipoTransacao.INVESTIMENTO, valorInvestido);
        registrarTransacao(transacao);
        return  aplicacao.calculaRendimentos(valorInvestido);
    }

    @Override
    public Double financiar(Financiamento financiamento, Double valorFinanciamento) {
        Transacao transacao = new Transacao(new Date(), TipoTransacao.FINANCIAMENTO, valorFinanciamento);
        registrarTransacao(transacao);
        return financiamento.calculaFinanciamento(valorFinanciamento);
    }

    @Override
    public void registrarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    @Override
    public void verificarExtratoPorPeriodo(Date dataInicio, Date dataFim) {
        for (Transacao transacao : transacoes) {
            if (transacao.getData().after(dataInicio) || transacao.getData().equals(dataInicio)
                    && transacao.getData().before(dataFim) || transacao.getData().equals(dataFim)) {
                System.out.println("Data: " + transacao.getData() + ", Tipo: " + transacao.getTipoTransacaoBancaria() + ", Valor: " + transacao.getValor());
            }
        }
    }
}
