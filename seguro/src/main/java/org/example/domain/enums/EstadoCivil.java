package org.example.domain.enums;

import org.example.domain.Automovel;

public enum EstadoCivil {
    SOLTEIRO (1, "solteiro"){
       public Double estadoCivilDesconto(Automovel automovel){
            return automovel.getValor() * 0.08;
        }
    },
    DIVORCIADO (2, "divorciado"){
       public Double estadoCivilDesconto(Automovel automovel){
            return automovel.getValor() * 0.08;
        }
    },
    CASADO (3, "casado") {
       public Double estadoCivilDesconto(Automovel automovel){
            return automovel.getValor()* 0.025;
        }
    },
    UNIAO_ESTAVEL (4, "união estável"){
       public Double estadoCivilDesconto(Automovel automovel){
            return automovel.getValor() * 0.025;
        }
    },
    VIUVO (5, "viúvo"){
       public Double estadoCivilDesconto(Automovel automovel){
            return automovel.getValor() * 0.05;
        }
    };

    private Integer codigo;
    private String descricao;

    EstadoCivil (Integer codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    };

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public abstract Double estadoCivilDesconto(Automovel automovel);
}
