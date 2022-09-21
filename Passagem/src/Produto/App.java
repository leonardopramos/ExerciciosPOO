package Produto;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        Eletrodoméstico ex = new Eletrodoméstico(235, "Máquina de lavar", 1999, 220);
        Eletrodoméstico ex1 = new Eletrodoméstico(2334, "Liquidificador", 550, 110);

        produtos.add(ex);
        produtos.add(ex1);

        System.out.println(produtos);
    }
}
