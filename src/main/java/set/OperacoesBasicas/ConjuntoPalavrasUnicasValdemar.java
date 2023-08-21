package main.java.set.OperacoesBasicas;




import java.util.*;

public class ConjuntoPalavrasUnicasValdemar {
    //Atributo
    private TreeSet<String> palavrasUnicasSet;

    //Construtor

    public ConjuntoPalavrasUnicasValdemar() {this.palavrasUnicasSet = new TreeSet<>();}

    //Metodo
    public void adicionarPalavra(String palavra){palavrasUnicasSet.add(palavra);}

    //Metodo
    public void removerPalavras(String palavra){
        if (!palavrasUnicasSet.isEmpty()){
            palavrasUnicasSet.remove(palavra);
        }else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Metodo
    public boolean verificarPalavra(String palavra){return palavrasUnicasSet.contains(palavra);}

    //Metodo
    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else {
            System.out.println("O conjunto está vazio!");
        }
    }


    //Metodo Principal e Final para EXECUTAR
    public static void main(String[] args) {
        ConjuntoPalavrasUnicasValdemar conjuntoPalavrasUnicasValdemar = new ConjuntoPalavrasUnicasValdemar();

        conjuntoPalavrasUnicasValdemar.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicasValdemar.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicasValdemar.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicasValdemar.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicasValdemar.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicasValdemar.exibirPalavrasUnicas();

        conjuntoPalavrasUnicasValdemar.removerPalavras("Palavra 2");
        conjuntoPalavrasUnicasValdemar.exibirPalavrasUnicas();

        conjuntoPalavrasUnicasValdemar.removerPalavras("Palavra 5");
        System.out.println(conjuntoPalavrasUnicasValdemar.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicasValdemar.exibirPalavrasUnicas();
    }
}
