package Conta;

public class ContaComLimite extends ContaBancaria{

    private double limite;
    private double saldo;
    private double taxaJuros;

    public ContaComLimite(int numeroConta, String nomeCorrentista, double limite) {
        super(numeroConta, nomeCorrentista);
        this.limite = limite;
        this.saldo = limite;
    }
    public double getJuros() {
        return taxaJuros;
    }
    public boolean quitaJuros(){
        this.taxaJuros = 0;
        return true;
    }
    @Override
    public boolean saca(double valor){
        if (valor < 0){
            System.out.println("Valor inválido");
            return false;
        } else if (valor > this.limite + this.saldo){
            System.out.println("Valor do saque maior que o saldo disponível");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
}
