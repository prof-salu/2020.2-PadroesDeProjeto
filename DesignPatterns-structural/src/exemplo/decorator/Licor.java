package exemplo.decorator;

public class Licor extends CoquetelDecorator {
	public Licor(Coquetel coquetel) {
		super(coquetel);
		nome = "Licor de Menta";
		preco = 9;
	}
}
