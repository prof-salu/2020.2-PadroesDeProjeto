package visitor;

public class Onibus extends Veiculo {
	public Onibus(String placa) {
		super(placa);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
