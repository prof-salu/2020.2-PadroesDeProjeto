package observer;

public class BarraObserver extends DadosObserver {

	public BarraObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		String barraA = "", barraB = "", barraC = "";
		for (int i = 0; i < dados.getState().valorA; i++)
			barraA += '=';
		for (int i = 0; i < dados.getState().valorB; i++)
			barraB += '=';
		for (int i = 0; i < dados.getState().valorC; i++)
			barraC += '=';
		System.out.println();
		System.out.println("Barras:");
		System.out.println("Valor A: " + barraA);
		System.out.println("Valor B: " + barraB);
		System.out.println("Valor A: " + barraC);
		System.out.println();
	}
}