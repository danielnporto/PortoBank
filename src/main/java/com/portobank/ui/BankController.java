package main.java.com.portobank.ui;

import main.java.com.portobank.core.Account;
import java.util.Scanner;
import java.util.Random;

public class BankController {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public BankController() {

    }

    public void criarConta() {
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        // Atribuindo um valor aleatório entre 1000 e 1999 para o ID.
        int id = 1000 + random.nextInt(1000);
        Account conta = new Account(nome, id);

        System.out.println("Conta criada para " + conta.getAccNome() + " ID: " + conta.getAccId());
    }



}
