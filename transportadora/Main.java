package transportadora;

public class Main {
    public static void main(String[] args) {
        TransporteAereo transporteAereo = new TransporteAereo();
        TransporteNautico transporteNautico = new TransporteNautico();

        System.out.printf("Frete do Transporte Aéreo: %.2f \n", transporteAereo.calculaFrete(20, 30));
        System.out.printf("Frete do Transporte Náutico: %.2f \n", transporteNautico.calculaFrete(30, 40));
    }
}
