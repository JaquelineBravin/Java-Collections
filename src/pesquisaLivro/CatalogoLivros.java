package pesquisaLivro;

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

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("1", "autor 1", 2015);
    catalogoLivros.adicionarLivro("livro 2", "autor 2", 2011);
    catalogoLivros.adicionarLivro("livro 3", "autor 3", 2010);
    catalogoLivros.adicionarLivro("livro 4", "autor 3", 2018);

    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }

}