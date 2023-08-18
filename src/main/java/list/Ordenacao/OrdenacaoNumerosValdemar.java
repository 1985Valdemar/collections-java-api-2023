package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumerosValdemar {
    //atributos
    private List<Integer>Numerolist;

    //Construtor
    public OrdenacaoNumerosValdemar(){this.Numerolist = new ArrayList<>();}

    //Metodo Adicionar Numero
    public void adicionarrNumero(int numero){this.Numerolist.add(numero);}

    public List<Integer> ordenarAscedente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.Numerolist);
        if (!Numerolist.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.Numerolist);
        if (!Numerolist.isEmpty()){
           numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibriNumeros(){
        if (!Numerolist.isEmpty()){
            System.out.println(this.Numerolist);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumerosValdemar numeros = new OrdenacaoNumerosValdemar();

        numeros.adicionarrNumero(2);
        numeros.adicionarrNumero(5);
        numeros.adicionarrNumero(4);
        numeros.adicionarrNumero(1);
        numeros.adicionarrNumero(99);
        numeros.exibriNumeros();

        System.out.println(numeros.ordenarAscedente());
        numeros.exibriNumeros();

        System.out.println(numeros.ordenarDescendente());
        numeros.exibriNumeros();
    }
}
