package Passagem;

public class App {

    public static void main(String[] args) {

        Economy ec = new Economy("601.374.700-88", "Leonardo Ramos", "28C", 1700.0);
        Executive ex = new Executive("601.374.700-88", "Leonardo Ramos", "28C", 2800.0);
        Premier pr = new Premier("601.374.700-88", "Leonardo Ramos", "28C", 5000.0);

        System.out.println("Custo bagagem Economico: " + ec.custoBagagem(1, new double[]{30.0}));
        System.out.println("Custo bagagem Executivo: " + ex.custoBagagem(3, new double[]{30.0, 25.0, 12.5}));
        System.out.println("Custo bagagem Passagem.Premier: " + pr.custoBagagem(5, new double[]{30.0, 35.0, 44.0, 22.5, 43.0}));

    }
}
