package state;

public interface MarioState {

	public abstract MarioState pegarCogumelo();

	public abstract MarioState pegarFlor();

	public abstract MarioState pegarPena();

	public abstract MarioState sofrerDano();
}
