package SetTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> tarefaSet;
	
	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa remover = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					remover = t;
					break;
				}
			}
			tarefaSet.remove(remover);
		} else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	
	public int contarTarefas() {
		return tarefaSet.size();
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa c : tarefaSet) {
			if (c.getDescricao().equalsIgnoreCase(descricao)) {
				c.setConcluida(true);
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa pendente = null;
		for (Tarefa p : tarefaSet) {
			if (p.getDescricao().equalsIgnoreCase(descricao)) {
				pendente = p;
				break;
			}
		} if (pendente != null) {
			pendente.setConcluida(true);
		} else {
			System.out.println("Tarefa não encontrada.");
		}
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> concluidas = new HashSet<>();
		for (Tarefa t : tarefaSet) {
			if (t.isConcluida()) {
				concluidas.add(t);
			}
		} return concluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> pendentes = new HashSet<>();
		for (Tarefa t : tarefaSet) {
			if (!t.isConcluida()) {
				pendentes.add(t);
			}
		} return pendentes;
	}
	
	public void limparListaTarefas() {
		tarefaSet.clear();
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercício");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    listaTarefas.exibirTarefas();

	    listaTarefas.removerTarefa("Fazer exercício");
	    listaTarefas.exibirTarefas();

	    System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    System.out.println(listaTarefas.obterTarefasPendentes());

	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	    listaTarefas.exibirTarefas();

	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }
	

}
