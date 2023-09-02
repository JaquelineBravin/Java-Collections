package carrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	//atributo Carrinho contendo as item com o nome comprasNoCarrinho, se chama item pois tem q ser o mesmo nome da outra classe
	private List<Item> comprasList;

	//objeto que irá criar um arraylist vazio
	public CarrinhoCompras() {
		this.comprasList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		comprasList.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome, Number preco, int quantidade) {
		List<Item> itemRemover = new ArrayList<>();
		for (Item i : comprasList) { //pra cada item passo a lista de compras
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemRemover.add(i);
			}
		}
		comprasList.removeAll(itemRemover);
	}
	
	public double calcularValorTotal() {
		double total = 0;
		for (Item item : comprasList) {
			double valorItem = item.getPreco() * item.getQuantidade();
			total += valorItem;
		}
		return total;
	}
	
	public void exibirItens() {
		if (!comprasList.isEmpty()) {
			System.out.println(comprasList);
		} else {
			System.out.println("Lista vazia!");
		}
	}
	
	 @Override
	  public String toString() {
	    return "CarrinhoDeCompras{" +
	        "itens=" + comprasList +
	        '}';
	  }
	
	public static void main(String args[]) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionarItem("bolacha", 5, 1);
		carrinho.adicionarItem("batata", 5, 2);

		carrinho.calcularValorTotal();
		//carrinho.exibirItens();
	}
	
}
