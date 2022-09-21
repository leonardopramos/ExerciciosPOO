package Passagem;

public class Economy extends Passagem{

    public Economy(String c, String n, String ass, double cst) {
        super(c, n, ass, cst);
    }

    @Override
    public double custoBagagem(int qtdade, double[] pesos) {
        double c = 0;
        for (int i = 0; i < qtdade; i++) {
            c += 0.5 * pesos[i];
        }
        double adicional = qtdade * 10;
        return c + adicional;
    }
}
