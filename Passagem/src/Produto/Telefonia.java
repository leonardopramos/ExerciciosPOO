package Produto;

public class Telefonia extends Produto{

    private boolean importado = true;

    public Telefonia(int codigo, String descricao, double preco, boolean importado) {
        super(codigo, descricao, preco);
        this.importado = importado;
    }

    @Override
    public double getImposto() {
        if(importado == true){
            return super.getPreco() * 0.5;
        } else {
            return super.getPreco() * 0.1;
        }
    }


}
