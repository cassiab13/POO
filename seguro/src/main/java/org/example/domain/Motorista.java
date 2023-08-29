package org.example.domain;

import org.example.domain.enums.EstadoCivil;

public class Motorista extends Pessoa {
    private Automovel automovel;
    private Estacionamento estacionamento;

    public Motorista(String nome, EstadoCivil estadoCivil, Automovel automovel) {
        super(nome, estadoCivil);
        this.automovel = automovel;
    }
    public Motorista(String nome, EstadoCivil estadoCivil, Automovel automovel, Estacionamento estacionamento) {
        super(nome, estadoCivil);
        this.automovel = automovel;
        this.estacionamento = estacionamento;
    }

    public Automovel getAutomovel() {
        return automovel;
    }
}
