package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatosSet;


  //Contrutor a vazio para intancia HASHSET<>() = VAZIO
  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }


  //Metodo Add ADICIONAR
  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  //Metodo void para IMPRIMIR
  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  //Metodo Para retornar Set=List
  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();//new HashSet<>()para adicionar ONDEM ALEATORIA
   if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {//se contato = C, STARTSWITH = String =nome
          contatosPorNome.add(c);//add = adicionar Set contato
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  //metodo retornar contato
  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;//null =depois que atualizar referenciar a variavel no caso contatoAtualizado
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {//para percorrer
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);//c.setNumero= "passar novo"(novoNumero)
          contatoAtualizado = c;//contato Atualizadado para retornar CONTATO
          break;//PARAR LAÇO
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Frank", 5665);
    agendaContatos.adicionarContato("Camila", 5665);
    agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
    agendaContatos.adicionarContato("Camila DIO", 654987);
    agendaContatos.adicionarContato("Maria Silva", 1111111);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

    agendaContatos.exibirContatos();
  }
}
