package visitor;

public abstract class Veiculo {
	private String placa;

	public Veiculo(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [placa=" + placa + "]";
	}

	public abstract void accept(Visitor v);
}
