package Embalagens;

public class App {

    public static void main(String[] args) {

        Caixa cx = new Caixa("785662", 12.5, 18.0, 7.0, 6.0);

        System.out.println(cx);

        EmbalagensCilindricas em = new EmbalagensCilindricas("12948", 55.5, 6, 4);

        System.out.println(em);
    }
}
