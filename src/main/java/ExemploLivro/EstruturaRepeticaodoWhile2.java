package main.java.ExemploLivro;


import java.util.Scanner;

public class EstruturaRepeticaodoWhile2 {
    public static void main(String[] args) {

        int n, s=0;
        String resp;

        //n = numero

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            //s += n;//ou s= s+n;
            s = s+n;
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equalsIgnoreCase("S"));
        System.out.println("Asoma de todos os valores é " +s);//concatenar para somar2
    }

}
