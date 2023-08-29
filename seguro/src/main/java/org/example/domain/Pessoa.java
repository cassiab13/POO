package org.example.domain;

import org.example.domain.enums.EstadoCivil;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;

    public Pessoa(String nome, EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
