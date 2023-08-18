package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumerosValdemar {
    //atributo <>=list generica
    private List<Integer> numeros;

    //Construtor
    public SomaNumerosValdemar() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
        return soma;
    }

    //Metodo Maior Numero
    public int enccontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("a Lista está vazia!");
        }
    }

    //Metodo Menor Numero
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    //Metodo exibirNUmeros
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    //Metodo Principal
    public static void main(String[] args) {
        SomaNumerosValdemar somaNumerosValdemar = new  SomaNumerosValdemar();

        somaNumerosValdemar.adicionarNumeros(5);
        somaNumerosValdemar.adicionarNumeros(0);
        somaNumerosValdemar.adicionarNumeros(0);
        somaNumerosValdemar.adicionarNumeros(-2);
        somaNumerosValdemar.adicionarNumeros(10);
        somaNumerosValdemar.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumerosValdemar.calcularSoma());

        System.out.println("Maior numero = " +somaNumerosValdemar.enccontrarMaiorNumero());

        System.out.println("Menor numero = " + somaNumerosValdemar.encontrarMenorNumero());

    }

}