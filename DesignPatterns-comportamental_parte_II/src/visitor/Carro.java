package visitor;

public class Carro extends Veiculo {
	public Carro(String placa) {
		super(placa);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
