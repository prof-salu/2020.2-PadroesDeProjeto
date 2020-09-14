package exemplo.facade;

public class Facade {
	protected Funcionario funcionario;
	protected Cargo cargo;
	protected Setor setor;

	public Facade() {
		setor = new Setor();
		cargo = new Cargo();
		funcionario = new Funcionario();
	}

	public void getFuncionario() {
		funcionario.getFuncionario();
	}

	public void getCargo() {
		cargo.getCargo();
	}

	public void getSetor() {
		setor.getSetor();
	}
}
