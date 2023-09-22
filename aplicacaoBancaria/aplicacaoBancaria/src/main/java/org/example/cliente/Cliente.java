package org.example.cliente;

public abstract class Cliente {

    private String nome;
    private String email;

    public Cliente (String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
