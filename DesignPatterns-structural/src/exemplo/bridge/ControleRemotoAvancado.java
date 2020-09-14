package exemplo.bridge;

public class ControleRemotoAvancado extends ControleRemotoBasico{

	public ControleRemotoAvancado(Aparelho aparelho) {
		super(aparelho);
	}
	
	public void mute() {
		System.out.println("Controle remoto: mute (sem som)");
        aparelho.setVolume(0);
	}

}
