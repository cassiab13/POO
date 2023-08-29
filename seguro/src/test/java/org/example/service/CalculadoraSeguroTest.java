package org.example.service;

import org.example.domain.Automovel;
import org.example.domain.Motorista;
import org.example.domain.enums.EstadoCivil;
import org.example.domain.enums.TipoVeiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraSeguroTest {
    @Test
    public void deveCalcularSolteiroSemEstacionamento(){
        Automovel automovel = new Automovel(45000.0, TipoVeiculo.PASSEIO);
        Motorista motorista1 = new Motorista("Motorista1", EstadoCivil.SOLTEIRO, automovel);

        CalculadoraSeguro calculo = new CalculadoraSeguro();
        Double resultado = calculo.calcular(motorista1);

        Assertions.assertEquals(9000.0, resultado);
    }
}
