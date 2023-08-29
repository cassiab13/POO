package org.example.domain;

import org.example.domain.enums.TipoVeiculo;

public class Automovel {
    private Double valor;
    private TipoVeiculo tipoVeiculo;

    //Construtor
    public Automovel (double valor, TipoVeiculo tipoVeiculo){
        this.valor = valor;
        this.tipoVeiculo = tipoVeiculo;
    }
    //Getters
    public double getValor() {
        return valor;
    }
    public TipoVeiculo getTipoVeiculo(){
        return tipoVeiculo;
    }

}
