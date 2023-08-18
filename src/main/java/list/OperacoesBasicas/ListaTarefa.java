package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  //atributo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }
  // ArrayList<>() = VAZIA PARA ADICIONAR TAREFAS NO CONSTRUTOR
  //METODO adicionar
  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }
  //METODO REMOVER UTILIZAR REMOVEALL
  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    //PARA PASSAR CADA TAREFA USANDO FOR
    //IF =LAÇOS DE REPETIÇÃO = if = se for iqual tarefa
    //()VAZIO = NOVA LISTA
    if (!tarefaList.isEmpty()) {
      for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          tarefasParaRemover.add(t);
        }
      }
      //laço de repetição para ler tarefaList
      tarefaList.removeAll(tarefasParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  //para testar indivivual usar main

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    //CELECIONA MAIS CTRL+/ ELE COMENTA
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    listaTarefa.adicionarTarefa("Tarefa 3");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
