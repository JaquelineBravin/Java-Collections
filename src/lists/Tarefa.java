package lists;

public class Tarefa {
	//atributo
	private String description;

	public Tarefa(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}
	
	

}
