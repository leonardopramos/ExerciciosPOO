package Embalagens;

public abstract class Embalagens {

    private String codigoReferencia;
    private double custoUnitario;

    public Embalagens(String codigoReferencia, double custoUnitario) {
        this.codigoReferencia = codigoReferencia;
        this.custoUnitario = custoUnitario;
    }

    public String toString() {
        String aux ="";
        aux+= "----------------------------------------" + "\n";
        aux += "Codigo de referencia: " + codigoReferencia + "\n";
        aux += "Nome: " + this.getClass().getName() + "\n";
        aux += "Custo unitario: " + custoUnitario + "\n";

        return aux;
    }
}
