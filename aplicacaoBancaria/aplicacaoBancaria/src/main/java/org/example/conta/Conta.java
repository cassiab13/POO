package org.example.conta;

import org.example.cliente.Cliente;

public abstract class Conta {
    private TipoConta tipoConta;
    private Integer numeroConta;
    private Double saldo;
    private Cliente titular;

    public Conta(TipoConta tipoConta, Integer numeroConta, Double saldo, Cliente titular){
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public TipoConta getTipoConta(){return tipoConta; }

    public Cliente getTitular() {
        return titular;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
