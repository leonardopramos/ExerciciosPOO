package Embalagens;

public class EmbalagensCilindricas extends Embalagens{

    private double raio;
    private double altura;

    public EmbalagensCilindricas(String codigoReferencia, double custoUnitario, double raio, double altura) {
        super(codigoReferencia, custoUnitario);
        this.raio = raio;
        this. altura = altura;
    }

    public double volumeLiquido(double raio, double altura){
        double a = 0;

        a = (Math.PI * (Math.pow(raio, 2))) * altura;

        return a;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Volume líquido: " + volumeLiquido(raio, altura) + "\n";
        aux+= "----------------------------------------" + "\n";
        return super.toString() + aux;
    }
}
