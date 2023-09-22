package org.example.conta;

public enum TipoConta {
    CORRENTE(1, 0.0),
    CONJUNTA(2, 0.0),
    POUPANCA(3, 50.0),
    SALARIO(4, 0.0);

    private Integer tipoConta;
    private Double saldoMinimo;

    TipoConta(Integer tipoConta, Double saldoMinimo){
        this.tipoConta = tipoConta;
        this.saldoMinimo = saldoMinimo;
    }

    public Integer getTipoConta(){
        return tipoConta;
    }

    public Double getSaldoMinimo() {
        return saldoMinimo;
    }
}
