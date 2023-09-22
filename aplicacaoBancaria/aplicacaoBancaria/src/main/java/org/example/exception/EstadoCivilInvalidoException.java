package org.example.exception;

public class EstadoCivilInvalidoException extends Exception {
    public EstadoCivilInvalidoException(){
        super("Conta conjunta só pode ser aberta por pessoas casadas ou em união estável.");
    }
}
