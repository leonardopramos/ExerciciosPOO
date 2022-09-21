package Conta;

public class ContaBancaria {

    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public boolean depoista(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }
    public boolean saca(double valor){
        if (valor < 0){
            System.out.println("Valor inválido");
            return false;
        } else if (valor > this.saldo){
            System.out.println("Valor do saque maior que o saldo disponível");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
}
