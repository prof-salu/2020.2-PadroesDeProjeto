package exemplo.facade;

public class Setor {
	private String descricao;

	public Setor() {
		this.descricao = "CPD";
	}

	public void getSetor() {
		System.out.println("Setor: " + descricao);
	}
}
