package exemplo.bridge;

public class ControleRemotoBasico implements ControleRemoto {

	protected Aparelho aparelho;

	public ControleRemotoBasico(Aparelho aparelho) {
		this.aparelho = aparelho;
	}

	@Override
	public void ligar() {
		if (aparelho.estaLigado()) {
			aparelho.desligar();
		} else {
			aparelho.ligar();
		}
	}

	@Override
	public void abaixarVolume() {
		System.out.println("Controle remoto: abaixando volume");
		aparelho.setVolume(aparelho.getVolume() - 10);
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Controle remoto: aumentando volume");
		aparelho.setVolume(aparelho.getVolume() + 10);
	}

	@Override
	public void avancarCanal() {
		System.out.println("Controle remoto: avancando canal");
		aparelho.setCanal(aparelho.getCanal() + 1);
	}

	@Override
	public void voltarCanal() {
		System.out.println("Controle remoto: voltando canal");
		aparelho.setCanal(aparelho.getCanal() - 1);
	}

}
