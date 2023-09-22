package org.example.servicosBancarios;

import java.util.Date;

public class Transacao {
    private Date data;
    private TipoTransacao tipoTransacaoBancaria;
    private Double valor;
    
    public Transacao(Date data, TipoTransacao tipoTransacaoBancaria, Double valor){
        this.data = data;
        this.tipoTransacaoBancaria = tipoTransacaoBancaria;
        this.valor = valor;
    }
    
    public Date getData(){
        return data;
    }

    public TipoTransacao getTipoTransacaoBancaria() {
        return tipoTransacaoBancaria;
    }

    public Double getValor() {
        return valor;
    }

}
