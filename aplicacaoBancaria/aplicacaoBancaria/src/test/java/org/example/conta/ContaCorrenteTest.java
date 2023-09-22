package org.example.conta;

import org.example.cliente.ClientePessoaFisica;
import org.example.cliente.EstadoCivil;
import org.example.exception.ValorMaiorZeroException;
import org.example.servicosBancarios.Aplicacao;
import org.example.servicosBancarios.Financiamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContaCorrenteTest {
    ClientePessoaFisica joaoDaSilva = new ClientePessoaFisica("Joao da Silva", "Joao@yahoo.com.br", "11111111199", EstadoCivil.SOLTEIRO);
    ContaCorrente contaCorrente = new ContaCorrente(TipoConta.CORRENTE, 1234, 0.0, joaoDaSilva);

    @Test
    public void depositarTest() {
        contaCorrente.depositar(200.00);
        Double resultado = (contaCorrente.getSaldo());
        Assertions.assertEquals(200.00, resultado);
    }

    @Test
    public void pagarTest() {
        contaCorrente.depositar(200.00);
        contaCorrente.pagar(100.00);
        Double resultado = contaCorrente.getSaldo();
        Assertions.assertEquals(100.00, resultado);
    }

    @Test
    public void investirTest(){
        Aplicacao aplicacao = Aplicacao.TESOURO_DIRETO;
        Double resultado = contaCorrente.investir(aplicacao, 3000.00);
        Assertions.assertEquals(141.00, resultado);
    }

    @Test
    public void financiarTest(){
        Financiamento financiamento = Financiamento.CARRO;
        Double resultado = contaCorrente.financiar(financiamento, 40000.00);
        Assertions.assertEquals(formatarCasasDecimais(64337.49), formatarCasasDecimais(resultado));
    }

    private String formatarCasasDecimais(Double valor){
        return String.format("%.2f", valor);
    }
}
