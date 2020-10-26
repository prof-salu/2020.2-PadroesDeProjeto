package observer;

public class TabelaObserver extends DadosObserver {
	
	public TabelaObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		System.out.println();
		System.out.println("Tabela:");
		System.out.println("Valor A: " + dados.getState().valorA);
		System.out.println("Valor B: " + dados.getState().valorB);
		System.out.println("Valor C: " + dados.getState().valorC);
		System.out.println();
	}
}