package org.example.conta;

import org.example.cliente.ClientePessoaFisica;
import org.example.cliente.EstadoCivil;
import org.example.exception.SaldoInsuficienteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaPoupancaTest {
    ClientePessoaFisica joaoDaSilva = new ClientePessoaFisica("Joao da Silva", "Joao@yahoo.com.br", "11111111199", EstadoCivil.SOLTEIRO);

    @Test
    public void abrirContaMenos50Reais() throws SaldoInsuficienteException {
        double saldoInicial = 30.0;

        Assertions.assertThrows(SaldoInsuficienteException.class, () ->  {
            ContaPoupanca contaPoupanca = new ContaPoupanca(TipoConta.POUPANCA, 1234, saldoInicial, joaoDaSilva);
        });
    }

    @Test
    public void abrirContaMais50Reais() throws SaldoInsuficienteException{
        ContaPoupanca contaPoupanca = new ContaPoupanca(TipoConta.POUPANCA, 1234, 100.0, joaoDaSilva);
        double saldoInicial = contaPoupanca.getSaldo();

        Assertions.assertEquals(100.0, saldoInicial);
    }

}
