package transportadora;

public class TransporteAereo {

    public double calculaFrete(int altura, int largura){
        if(largura !=0 || altura != 0) {
            return ((double) altura / largura)*0.2;
        } else {
            return 0;
        }
    }
}
