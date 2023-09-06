package SetTarefas;

public class Tarefa {
	private String descricao;
	private Boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public Boolean isConcluida() {
		return concluida;
	}
	
	public void setDescricao(String descricao) {
	    this.descricao = descricao;
	  }

	public void setConcluida(boolean concluida) {
	    this.concluida = concluida;
	}

}

	
