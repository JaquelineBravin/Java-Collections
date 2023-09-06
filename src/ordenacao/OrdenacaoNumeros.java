package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List<Integer> numerosList;
	
	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numerosList.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
	    List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
	    Collections.sort(numerosAscendente);
	      return numerosAscendente;
	}
	
	public void exibirNumeros() {
	    if (!numerosList.isEmpty()) {
	      System.out.println(this.numerosList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	
	
	

	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    numeros.exibirNumeros();

	    System.out.println(numeros.ordenarAscendente());

	    numeros.exibirNumeros();
	}

}
