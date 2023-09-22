package org.example.servicosBancarios;

public enum Aplicacao {
    TESOURO_DIRETO (0.042, 0.005) {
        @Override
        public Double calculaRendimentos(Double valorInvestido) {
            return (valorInvestido*(getTaxa() + getJuros()));
        }
    },
    CDB (0.03, 0.005) {
        @Override
        public Double calculaRendimentos(Double valorInvestido) {
            return (valorInvestido*(getTaxa() + getJuros()));
        }
    },
    LCI (0.02, 0.006) {
        @Override
        public Double calculaRendimentos(Double valorInvestido) {
            return (valorInvestido*(getTaxa() + getJuros()));
        }
    },
    LCA (0.041, 0.003) {
        @Override
        public Double calculaRendimentos(Double valorInvestido) {
            return (valorInvestido*getTaxa() + valorInvestido*getJuros());
        }
    },
    FUNDOS_IMOBILIARIOS (0.035, 0.004) {
        @Override
        public Double calculaRendimentos(Double valorInvestido) {
            return (valorInvestido*(getTaxa() + getJuros()));
        }
    };

    private Double taxa;
    private Double juros;

    Aplicacao(Double taxa, Double juros){
        this.taxa = taxa;
        this.juros = juros;
    }

    public Double getTaxa(){
        return taxa;
    }

    public Double getJuros(){
        return juros;
    }

    public abstract Double calculaRendimentos(Double valorInvestido);
}
