package main.java.com.portobank.core;

public class Account {

    public String accNome;
    public int accId;
    private double saldo;
    private double transacaoAnterior;
    private double investimento;
    private double taxaJuros = 1.0125;

    public Account(String accNome, int accId){

    }

    public void deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            transacaoAnterior = valor;
        }
    }

    public void retirada(double valor){
        if(valor != 0){
            this.saldo -= valor;    
            transacaoAnterior = -valor;
        }
    }

    public void investimento(int meses){
        this.investimento = (this.saldo * this.taxaJuros);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getTransacaoAnterior() {
        return this.transacaoAnterior;
    }

    public double getInvestimento() {
        return investimento;
    }
}
