package org.example.domain;

import org.example.domain.enums.EstadoCivil;
import org.example.domain.enums.TipoVeiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o valor do veículo: ");
        Double valorAutomovel = reader.nextDouble();

        System.out.println("Escolha o tipo de veículo: ");
        for (TipoVeiculo tipoVeiculo : TipoVeiculo.values()) {
            System.out.println(tipoVeiculo.getCodigo() + " - " + tipoVeiculo.getDescricao());
        }
        int opcaoTipoVeiculo = reader.nextInt();
        TipoVeiculo tipoVeiculoEscolhido = TipoVeiculo.values()[opcaoTipoVeiculo - 1];
        System.out.println(tipoVeiculoEscolhido.getCodigo());

        Automovel carro1 = new Automovel(valorAutomovel, tipoVeiculoEscolhido);

        System.out.println("Escolha o estado civil: ");
        for (EstadoCivil estadoCivil : EstadoCivil.values()) {
            System.out.println(estadoCivil.getCodigo() + " - " + estadoCivil.getDescricao());
        }
        int opcaoEstadoCivil = reader.nextInt();
        EstadoCivil estadoCivilEscolhido = EstadoCivil.values()[opcaoEstadoCivil - 1];

//        System.out.println("Tem portão automático?\n 1 - sim \n 2 - não");
//        boolean portaoAutomatico;
//        if (Estacionamento.isPortaoAutomatico(reader.nextInt())) portaoAutomatico = true;
//        else portaoAutomatico = false;


        double valorSeguroEstadoCivil = estadoCivilEscolhido.estadoCivilDesconto(carro1);
        double valorSeguroTipoVeiculo = tipoVeiculoEscolhido.calcularDescontoSeguro(carro1);

        double valorTotalSeguro;

        if(opcaoEstadoCivil == 1 || opcaoEstadoCivil == 2){
            valorTotalSeguro = valorSeguroTipoVeiculo + valorSeguroEstadoCivil;
//            System.out.println(valorAutomovel);
//            System.out.println(valorSeguroTipoVeiculo);
//            System.out.println(valorSeguroEstadoCivil);
        } else {
            valorTotalSeguro = valorSeguroTipoVeiculo - valorSeguroEstadoCivil;
        }
        System.out.println("O valor total do seguro é: " + valorTotalSeguro);
    }
}
