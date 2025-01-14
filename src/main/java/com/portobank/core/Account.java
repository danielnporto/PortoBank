package main.java.com.portobank.core;

public class Account {

    private String accNome;
    private int accId;
    private double saldo;
    private double transacaoAnterior;
    private double investimento;

    public Account(String accNome, int accId){
        this.accNome = accNome;
        this.accId = accId;
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
        double taxaJuros = 1.0125;
        this.investimento = (this.saldo * taxaJuros);
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

    public int getAccId() {
        return accId;
    }

    public String getAccNome() {
        return accNome;
    }
}
