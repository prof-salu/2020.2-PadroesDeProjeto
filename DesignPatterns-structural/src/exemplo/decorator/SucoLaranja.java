package exemplo.decorator;

public class SucoLaranja extends CoquetelDecorator {
	public SucoLaranja(Coquetel coquetel) {
		super(coquetel);
		nome = "Suco deLaranja";
		preco = 7.5;
	}
}
