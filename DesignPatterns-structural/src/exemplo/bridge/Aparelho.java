package exemplo.bridge;

public interface Aparelho {
	boolean estaLigado();
    void ligar();
    void desligar();
    int getVolume();
    void setVolume(int volume);
    int getCanal();
    void setCanal(int canal);
    void exibirStatus();
}
