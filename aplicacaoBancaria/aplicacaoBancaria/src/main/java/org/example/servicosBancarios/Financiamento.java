package org.example.servicosBancarios;

public enum Financiamento {
    CASA (48, 0.05) {
        @Override
        public Double calculaFinanciamento(Double valorFinanciamento) {
            return valorFinanciamento*Math.pow((1 + CASA.taxaJuros), CASA.parcelas);
        }
    },
    CARRO(24, 0.02) {
        @Override
        public Double calculaFinanciamento(Double valorFinanciamento) {
            return valorFinanciamento*Math.pow((1 + CARRO.taxaJuros), CARRO.parcelas);
        }
    },
    MOTO (12, 0.05) {
        @Override
        public Double calculaFinanciamento(Double valorFinanciamento) {
            return valorFinanciamento*Math.pow((1 + MOTO.taxaJuros), MOTO.parcelas);
        }
    };

    private Integer parcelas;
    private Double taxaJuros;

    Financiamento(Integer parcelas, Double taxaJuros){
        this.parcelas = parcelas;
        this.taxaJuros = taxaJuros;
    }

    public abstract Double calculaFinanciamento(Double valorFinanciamento);
}
