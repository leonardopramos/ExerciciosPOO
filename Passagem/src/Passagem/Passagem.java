package Passagem;

public class Passagem {
    private final String cpf;
    private final String nome;
    private String assento;
    private final double custoPassagem;

    public Passagem(String c, String n, String ass, double cst) {
        if (c.length() == 0) {
            cpf = "0000";
        } else {
            cpf = c;
        }
        nome = n;
        assento = ass;
        custoPassagem = cst;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getAssento() {
        return assento;
    }

    public double getCustoPassagem() {
        return custoPassagem;
    }

    public double custoBagagem(int qtdade, double[] pesos) {
        double c = 0;
        for (int i = 0; i < qtdade; i++) {
            c += 0.5 * pesos[i];
        }
        return c;
    }

    public double defineAssento(String poltrona) {
        assento = poltrona;
        return 5.0;
    }

    public String toString() {
        return ">" + getCpf() + "," +
                getNome() + "," +
                getAssento() + "," +
                getCustoPassagem();
    }
}