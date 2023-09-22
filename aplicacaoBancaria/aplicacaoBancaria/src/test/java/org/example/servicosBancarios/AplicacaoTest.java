package org.example.servicosBancarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AplicacaoTest {
    Double valorInvestido = 1000.0;

    @Test
    public void testaCalculaRendimentosTesouroDireto(){
        Aplicacao tesouroDireto = Aplicacao.TESOURO_DIRETO;
        Double rendimentos = (double) Math.round(tesouroDireto.calculaRendimentos(valorInvestido));

        Assertions.assertEquals(47.0, rendimentos);
    }

    @Test
    public void testaCalculaRendimentosCDB(){
        Aplicacao cdb = Aplicacao.CDB;
        Double rendimentos = (double) Math.round(cdb.calculaRendimentos(valorInvestido));

        Assertions.assertEquals(35.0, rendimentos);
    }

    @Test
    public void testaCalculaRendimentosLci(){
        Aplicacao lci = Aplicacao.LCI;
        Double rendimentos = (double) Math.round(lci.calculaRendimentos(valorInvestido));

        Assertions.assertEquals(26.0, rendimentos);
    }

    @Test
    public void testaCalculaRendimentosLca(){
        Aplicacao lca = Aplicacao.LCA;
        Double rendimentos = (double) Math.round(lca.calculaRendimentos(valorInvestido));

        Assertions.assertEquals(44.0, rendimentos);
    }

    @Test
    public void testaCalculaRendimentosFundosImobiliarios(){
        Aplicacao fundosImobiliarios = Aplicacao.FUNDOS_IMOBILIARIOS;
        Double rendimentos = (double) Math.round(fundosImobiliarios.calculaRendimentos(valorInvestido));

        Assertions.assertEquals(39.0, rendimentos);
    }

}
