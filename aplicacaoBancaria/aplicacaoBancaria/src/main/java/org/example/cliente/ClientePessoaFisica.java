package org.example.cliente;

public class ClientePessoaFisica extends Cliente {

    private String cpf;
    private EstadoCivil estadoCivil;

    public ClientePessoaFisica(String nome, String email, String cpf, EstadoCivil estadoCivil){
        super(nome, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public boolean estadoCivilContaConjunta(EstadoCivil estadoCivil){
        return (estadoCivil == EstadoCivil.CASADO || estadoCivil == EstadoCivil.UNIAO_ESTAVEL);
    }
}
