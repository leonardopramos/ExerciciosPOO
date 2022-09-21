package Produto;

public class Eletrodoméstico extends Produto {

    private int voltagem;

    public Eletrodoméstico(int codigo, String descricao, double preco, int voltagem) {
        super(codigo, descricao, preco);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public static boolean testaVoltagem(Eletrodoméstico el) {
        if (el.getVoltagem() == 110) {
            System.out.println("Voltagem do produto: " + 110 + "v");
            return true;
        } else if (el.getVoltagem() == 220) {
            System.out.println("Voltagem do produto: " + 220 + "v");
            return true;
        } else if (el.getVoltagem() != 100 || el.getVoltagem() != 220) {
            System.out.println("Voltagem inválida.");
        }
        return false;
    }

    @Override
    public String toString() {
        String aux = "";

        aux += "***************************************************************" + "\n";
        aux += "Descrição do produto: " + getDescricao() + "\n";
        aux += "Valor para o consumidor: " + calculaPrecoConsumidor() + "\n";
        aux += "***************************************************************" + "\n";

        return aux;
    }
}
