package org.example.domain.enums;

import org.example.domain.Automovel;

public enum TipoVeiculo {

    PASSEIO (1, "Carro de passeio") {
        @Override
       public Double calcularDescontoSeguro(Automovel automovel) {
            return automovel.getValor() * 0.12;
        }
    },
    PASSEIO_USO_PROFISSIONAL (2, "Carro de passeio para uso profissional") {
        @Override
       public Double calcularDescontoSeguro(Automovel automovel) {
            return automovel.getValor() * 0.143;
        }
    },
    TRANSPORTE_ONIBUS (3, "Ônibus"){
        @Override
       public Double calcularDescontoSeguro(Automovel automovel) {
            return automovel.getValor() * 0.135;
        }
    },
    TRANSPORTE_VANS (4, "Van"){
        @Override
      public  Double calcularDescontoSeguro(Automovel automovel) {
            return automovel.getValor() * 0.135;
        }
    },
    CARGA (5, "Carga") {
        @Override
       public Double calcularDescontoSeguro(Automovel automovel) {
            return automovel.getValor() * 0.08;
        }
    };

//    private Double valorSeguro;
//
//    public Double getValorSeguro() {
//        return valorSeguro;
//    }

    private Integer codigo;
    private String descricao;

    TipoVeiculo (Integer codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    };

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }
    public abstract Double calcularDescontoSeguro(Automovel automovel);
}
