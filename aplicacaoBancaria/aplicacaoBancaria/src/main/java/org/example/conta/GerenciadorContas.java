package org.example.conta;

import org.example.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContas {
    private List<Conta> listaDeContas;

    public GerenciadorContas(){
        listaDeContas = new ArrayList<>();
    }

    public void add(TipoConta tipoConta, Integer numeroConta, Double saldo, Cliente nome) {
        ContaCorrente contaCorrente = new ContaCorrente(tipoConta, numeroConta, saldo, nome);
        listaDeContas.add(contaCorrente);
    }
}
