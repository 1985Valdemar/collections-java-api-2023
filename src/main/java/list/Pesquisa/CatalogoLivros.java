package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }
//METODO LIVRO
  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {//LAÇO DE REPETIÇÃO
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {//faz uma lista
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {//condição do laço maior=
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {//retorna um livro
    Livro livroPorTitulo = null;//objeto tipo livro
    if (!livroList.isEmpty()) {//IF=SE !=NÃO LIVROLIST ESTA VAZIA
      for (Livro l : livroList) {//LAÇO PARA REPETIR
        if (l.getTitulo().equalsIgnoreCase(titulo)) {//if=SE L=LIVRO
          livroPorTitulo = l;
          break;//PARAR POIS E SO UM LIVRO QUE PRECISA
        }
      }
      return livroPorTitulo;
    } else {//TRATAMENTO EXEÇOES SE NÃO TIVER ESCREVA FRASE
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();//INSTANCIADO CATALOGOlIVRO

    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

    System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
  }
}
