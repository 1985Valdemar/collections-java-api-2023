package main.java.list.OperacoesBasicas;

public class Itens {
    //ATRIBUTOS
    private String nome;
    private double preco;
    private int quanti;

    public Itens(String nome, double preco, int quanti){
        this.nome = nome;
        this.preco = preco;
        this.quanti = quanti;
    }

    public String getNome(){return nome;}

    public double getPreco(){return preco;}

    public int getQuanti(){return quanti;}

    @Override
    public String toString() {
        return "Itens{" +
                "name='" + nome + '\'' +
                ", preco=" + preco +
                ", quanti=" + quanti +
                '}';
    }
}

