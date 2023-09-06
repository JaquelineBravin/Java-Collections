package numero;

import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {

	private List<Integer> numeros;
	
	//construtor
	public SomaNumeros() {
		this.numeros = new ArrayList<>(); 
	}
	
	public void adicionar(int number) {
		this.numeros.add(number);
	}
	
	
	public int calcularSoma() {
		int soma = 0;
		for (Integer n : numeros) {
			soma += n;
		}
		return soma;
	}
	
	 public int encontrarMaiorNumero() {
		    int maiorNumero = Integer.MIN_VALUE;
		    if (!numeros.isEmpty()) {
		      for (Integer numero : numeros) {
		        if (numero >= maiorNumero) {
		          maiorNumero = numero;
		        }
		      }
		      return maiorNumero;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		  }

		  public int encontrarMenorNumero() {
		    int menorNumero = Integer.MAX_VALUE;
		    if (!numeros.isEmpty()) {
		      for (Integer numero : numeros) {
		        if (numero <= menorNumero) {
		          menorNumero = numero;
		        }
		      }
		      return menorNumero;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		  }
		
	public List<Integer> exibirNumeros() {
		return numeros;
	}
	
	 public static void main(String[] args) {
		    // Criando uma instância da classe SomaNumeros
		    SomaNumeros somaNumeros = new SomaNumeros();

		    somaNumeros.adicionar(5);
		    somaNumeros.adicionar(0);
		    somaNumeros.adicionar(0);
		    somaNumeros.adicionar(-2);
		    somaNumeros.adicionar(10);

		    System.out.println("Números adicionados:");
		    somaNumeros.exibirNumeros();

		    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

		    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

		    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
	}
}