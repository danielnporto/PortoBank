package main.java.com.portobank.core;

import java.util.Scanner;
import java.util.Random;

public class BankController {

    private Account conta;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public void criarConta() {
        String nome = recebeNome();
        int id = geraID();
        conta = new Account(nome, id);
        System.out.println("Conta de " + nome + " ID: " + id);
    }

    public void verificaSaldo(){
        apresentaUser();
        System.out.println("Saldo em conta: " + conta.getSaldo()); ;
    }

    public void depositar(){
        apresentaUser();
        System.out.println("Realizando deposito!");
        conta.deposito(recebeValor());
    }

    public void retirar(){
        apresentaUser();
        System.out.println("Realizando retirada!");
        conta.retirada(recebeValor());
    }

    public void investir(){
        apresentaUser();
        System.out.println("Calculando Investimento!");
        System.out.println("Quantos meses de investimento?");
        conta.investimento(scan.nextInt());
        System.out.println("Valor: " + conta.getInvestimento());
    }

    public void verOperacao(){
        if (conta.getOperacaoAnterior() < 0){
            System.out.println("Retiradada de " + conta.getOperacaoAnterior());
        } else if (conta.getOperacaoAnterior() > 0) {
            System.out.println("Deposito de " + conta.getOperacaoAnterior());
        }else {
            System.out.println("Não houve nenhuma operação");
        }
    }

    private void apresentaUser(){
        System.out.println("\n" + conta.getAccNome() + " - " + conta.getAccId());
    }

    private int geraID(){
        return 1000 + random.nextInt(1000);
    }

    private double recebeValor(){
        System.out.println("Digite o valor: ");
        return scan.nextDouble();
    }

    private String recebeNome(){
        System.out.println("Digite seu nome: ");
        return scan.nextLine();
    }

}
