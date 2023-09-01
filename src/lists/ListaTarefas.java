package lists;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	//atributo List contendo as tarefas com o nome de tarefaList
	private List<Tarefa> tarefaList; 
	
	//objeto que irá criar um arraylist vazio
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String description) {
		tarefaList.add(new Tarefa(description));
	}
	
	public void removerTarefa(String description) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int numTotal() {
		return tarefaList.size();
	}
	
	public void descriptionTarefa() {
		System.out.println(tarefaList);
	}
	
	//testando
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		System.out.println("O número total de elementos é: " + listaTarefa.numTotal());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos é: " + listaTarefa.numTotal());
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos é: " + listaTarefa.numTotal());
		
		listaTarefa.descriptionTarefa();
	}
}
