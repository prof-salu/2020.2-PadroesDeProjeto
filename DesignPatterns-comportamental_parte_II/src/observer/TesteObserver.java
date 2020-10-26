package observer;

public class TesteObserver {
	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		
		dados.attach(new TabelaObserver(dados));
		dados.attach(new BarraObserver(dados));
		dados.attach(new PercentualObserver(dados));
		
		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));
	}
}
