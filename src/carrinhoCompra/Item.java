package carrinhoCompra;

public class Item {
	
	//atributos
	private String nome;
	private Number preco;
	private int quantidade;
			

	public Item(String nome, Number preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Number getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	
}
