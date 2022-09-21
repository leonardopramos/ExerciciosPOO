package Conta;

public class ContaRemunerada extends ContaBancaria{

    private double saldo;

    public ContaRemunerada(int numeroConta, String nomeCorrentista) {
        super(numeroConta, nomeCorrentista);
        this.saldo = 0;
    }

    @Override
    public boolean depoista(double valor){
        if(valor > 0){
            this.saldo += valor;
            double desconto = this.saldo * 0.05;
            this.saldo -= desconto;
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }
}
