package Embalagens;

public class Caixa extends Embalagens{

    private double lado1;
    private double lado2;
    private double altura;

    public Caixa(String codigoReferencia, double custoUnitario, double lado1, double lado2, double altura) {
        super(codigoReferencia, custoUnitario);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }
    public double volumeLiquido(double lado1, double lado2, double altura){
        double a = 0;
        a = (lado1 * lado2) * altura;

        return a;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Volume liquido: " + volumeLiquido(lado1, lado2, altura) + "\n";
        aux+= "----------------------------------------" + "\n";
        return super.toString() + aux;
    }
}
