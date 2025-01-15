package main.java.com.portobank.core;

public class Account {

    private final String accNome;
    private final int accId;
    private double saldo;
    private double operacaoAnterior;
    private double investimento;

    public Account(String accNome, int accId) {
        this.accNome = accNome;
        this.accId = accId;
        this.saldo = 0.0;
        this.operacaoAnterior = 0.0;
        this.investimento = 0.0;
    }

    public void deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            operacaoAnterior = valor;
        }
    }

    public void retirada(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            operacaoAnterior = -valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void investimento(int meses) {
        if (meses <= 0) {
            System.out.println("Número de meses inválido.");
            return;
        }
        double taxaJurosMensal = 0.0125; // Juros mensais de 1,25%
        this.investimento = this.saldo * Math.pow(1 + taxaJurosMensal, meses); // Fórmula de juros compostos
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getOperacaoAnterior() {
        return this.operacaoAnterior;
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
