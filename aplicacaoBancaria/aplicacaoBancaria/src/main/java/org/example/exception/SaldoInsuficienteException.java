package org.example.exception;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("Saldo insuficiente.");
    }
}
