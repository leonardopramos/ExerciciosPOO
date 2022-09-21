package Produto;

public class EletroPesado extends Eletrodoméstico{

    public EletroPesado(int codigo, String descricao, double preco, int voltagem) {
        super(codigo, descricao, preco, voltagem);
    }

    @Override
    public double getMargemLucro() {
        if (super.getPreco() > 999){
            return super.getPreco() * 0.2;
        }
        return super.getPreco() * 0.4;
    }
}
