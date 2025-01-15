package main.java.com.portobank.ui;

import main.java.com.portobank.core.BankController;

import java.util.Scanner;

public class BankMenu {

    Scanner scan = new Scanner(System.in);

    public void startMenu(){

        BankController controller = new BankController();
        int opcao;

        controller.criarConta();

        do {
            System.out.println("\n----Operações Bancarias----");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Investir");
            System.out.println("5. Ver Transação Anterior");
            System.out.println("6. Sair");
            System.out.println("Escolha a opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    controller.verificaSaldo();
                    break;
                case 2:
                    controller.depositar();
                    break;
                case 3:
                    controller.retirar();
                    break;
                case 4:
                    controller.investir();
                    break;
                case 5:
                    controller.verOperacao();
                    break;
                case 6:
                    System.out.println("Encerrando Programa");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);
    }

}
