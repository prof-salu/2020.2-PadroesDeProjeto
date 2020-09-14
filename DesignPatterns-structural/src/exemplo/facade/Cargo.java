package exemplo.facade;

public class Cargo {
	private String descricao;
	private Double salario;

	public Cargo() {
		this.descricao = "Programador";
		this.salario = 2500.0;
	}

	public void getCargo() {
		System.out.println("Cargo: " + descricao);
		System.out.println("Salario: R$ " + salario);
	}
}
