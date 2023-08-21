package main.java.ExemploLivro;

import javax.swing.*;
import java.util.Scanner;

public class banco2 {


    public static void main(String[] args) {


        int numero;
        double saldoAtual;
        double valorOperacao;
        Double novoSaldo;
        int saldoDisponivel = 1000;

        System.out.println("Informe o número da sua conta");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sua conta "));

        System.out.println("Informe o seu saldo atual");
        saldoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu saldo atual "));

        System.out.println("Informe o tipo de operação: 1 Depósito."
                + " 2 Saque");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de operação: 1 Depósito."
                + " 2 Saque"));


        System.out.println("Informe o valor da operação");
        valorOperacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da operação "));

        if (numero == 1) {

            novoSaldo = (saldoAtual + valorOperacao);
            System.out.println("O seu novo saldo é: " + novoSaldo);
        } else {
            novoSaldo = (saldoAtual - valorOperacao);
            System.out.println("O seu novo saldo é: " + novoSaldo);
            if (novoSaldo < 0) {
                System.out.println("Conta estourada");

            }
        }

    }
}
