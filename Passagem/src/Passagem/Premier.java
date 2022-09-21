package Passagem;

public class Premier extends Executive{

    private String assento = super.getAssento();

    public Premier(String c, String n, String ass, double cst) {
        super(c, n, ass, cst);
    }

    @Override
    public double defineAssento(String poltrona) {
        assento = poltrona;
        return 0.0;
    }
    @Override
    public double custoBagagem(int qtdade, double[] pesos) {
        double c = 0;
        if (qtdade >= 2){
            qtdade -= 2;
        }
        for (int i = 0; i < qtdade; i++) {
            c += 0.5 * pesos[i];
        }
        return c / 2;
    }
    @Override
    public double getMilhas(int qtdade, double[] pesos) {
        return custoBagagem(qtdade, pesos) * 0.2;
    }
}
