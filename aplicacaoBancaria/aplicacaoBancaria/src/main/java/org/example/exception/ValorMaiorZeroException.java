package org.example.exception;

public class ValorMaiorZeroException extends Exception{

    public ValorMaiorZeroException(){
        super("Valor deve ser maior que zero.");
    }
}
