package exemplo.bridge;

public class TesteBridge {

	public static void main(String[] args) {
		testaAparelho(new TV());
		testaAparelho(new Radio());
	}
	
	public static void testaAparelho(Aparelho aparelho) {
        System.out.println("Testando o controle remoto basico.");
        ControleRemotoBasico controleBasico = new ControleRemotoBasico(aparelho);
        controleBasico.ligar();
        aparelho.exibirStatus();

        System.out.println("Testando o controle remoto avancado.");
        ControleRemotoAvancado controleAvancado = new ControleRemotoAvancado(aparelho);
        controleAvancado.ligar();
        controleAvancado.mute();
        aparelho.exibirStatus();
    }
}
