package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarinhoDeComprasValdemar {
    //ATRIBUTOS
    private List<Item> itensList;

    public CarinhoDeComprasValdemar(){this.itensList = new ArrayList<>();}

    public void adicionarItens(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itensList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()){
            for (Item i: itensList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itensList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista esta vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itensList.isEmpty()){
            for (Item item : itensList){
                double valorItens = item.getPreco()*item.getQuant();
                valorTotal+= valorItens; //valorTotal = valorTotal + valorItens;
            }
        return valorTotal;
        }else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }
    public void exibirItens(){
        if(!itensList.isEmpty()){
            System.out.println(this.itensList);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarinhoDeComprasValdemar{" +
                "itensList=" + itensList +
                '}';
    }

    public static void main(String[] args) {

        CarinhoDeComprasValdemar carinhoDeComprasValdemar = new CarinhoDeComprasValdemar();
        carinhoDeComprasValdemar.adicionarItens("Lápis",2d,3);
        carinhoDeComprasValdemar.adicionarItens("Lápis",2d,3);
        carinhoDeComprasValdemar.adicionarItens("Caderno",35d,1);
        carinhoDeComprasValdemar.adicionarItens("Borracha",2d,2);

        carinhoDeComprasValdemar.exibirItens();

        carinhoDeComprasValdemar.removerItem("Lápis");
        carinhoDeComprasValdemar.exibirItens();

        System.out.println("O valor total da compra é = "+carinhoDeComprasValdemar.calcularValorTotal());


    }
}
