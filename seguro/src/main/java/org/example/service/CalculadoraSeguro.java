package org.example.service;

import org.example.domain.Motorista;
import org.example.domain.enums.TipoVeiculo;

public class CalculadoraSeguro {
    public Double calcular(Motorista motorista){
        Double valorEstadoCivil = motorista.getEstadoCivil().estadoCivilDesconto(motorista.getAutomovel());
        Double valorTipoVeiculo = motorista.getAutomovel().getTipoVeiculo().calcularDescontoSeguro(motorista.getAutomovel());

        Double valorTotal= valorEstadoCivil + valorTipoVeiculo;
        return valorTotal;
    }
}
