package conjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	public Set<String> palavras;
	
	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}
	

	public void removerPalavra(String palavra) {
		if (palavras.contains(palavra)) {
			palavras.remove(palavra);
	      } else {
	        System.out.println("Palavra não encontrada no conjunto!");
	      }
	}
	
	public void verificarPalavra(String palavra) {
		if (palavras.contains(palavra)) {
			System.out.println("Palavra existe");
		} else {
			System.out.println("Não existe.");
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println("Palavras: " + palavras);
	}
	
	 public static void main(String[] args) {
		    // Criando uma instância da classe ConjuntoPalavrasUnicas
		    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		    conjuntoLinguagens.adicionarPalavra("Java");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("JavaScript");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("C++");
		    conjuntoLinguagens.adicionarPalavra("Ruby");

		    conjuntoLinguagens.exibirPalavrasUnicas();

		    conjuntoLinguagens.removerPalavra("Python");
		    conjuntoLinguagens.exibirPalavrasUnicas();

		    conjuntoLinguagens.removerPalavra("Swift");

		    // Verificando se uma linguagem está no conjunto
		    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
		    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

		    // Exibindo as linguagens únicas atualizadas no conjunto
		    conjuntoLinguagens.exibirPalavrasUnicas();
		  }

}
