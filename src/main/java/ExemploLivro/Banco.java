package main.java.ExemploLivro;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {





            System.out.println("Valor disponivel " + nota() + " reais");

        }
        public static int nota(){
            Scanner digita = new Scanner(System.in);

            System.out.println("Digite o valor para sacar");
            int sacar = digita.nextInt();
            int saldoDisponivel = 1000;

            if (sacar <= saldoDisponivel ){
                System.out.println("Obrigada sacar nossa agencia " + sacar + " reais");
                saldoDisponivel = saldoDisponivel - sacar;

            } else {
                System.out.println("Saldo indisponivel ");
            };

            return saldoDisponivel;
        }
    }
    