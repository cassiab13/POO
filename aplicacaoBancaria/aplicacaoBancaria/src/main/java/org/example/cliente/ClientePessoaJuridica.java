package org.example.cliente;

public class ClientePessoaJuridica extends Cliente {

    private String cnpj;

    public ClientePessoaJuridica(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

}
