package state;

public class MarioGrande implements MarioState {
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario comfogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState sofrerDano() {
		System.out.println("Mario pequeno");
		return new MarioPequeno();
	}
}
