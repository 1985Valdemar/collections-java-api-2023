package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  //atributo
  private Set<Convidado> convidadosSet;
//Construtor
  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }
//metodo
  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }
//metodo
  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {//se dentro convidado
        if (c.getCodigoConvite() == codigoConvite) {//se c.getCodi for = codigoconvite = remover
          convidadoParaRemover = c;
          break;//parar laço pois ja achou
        }
      }
      convidadosSet.remove(convidadoParaRemover);//objeto para remover
    } else {//Exception se não existir este codigo impimir está vazio
      throw new RuntimeException("O conjunto está vazio!");
    }
  }
//metodo
  public int contarConvidados() {
    return convidadosSet.size();
  }
//metodo
  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();//instanciado objeto
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

    conjuntoConvidados.exibirConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.exibirConvidados();
  }
}
