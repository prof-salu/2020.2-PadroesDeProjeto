package visitor;

public class Motocicleta extends Veiculo {
	public Motocicleta(String placa) {
		super(placa);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
