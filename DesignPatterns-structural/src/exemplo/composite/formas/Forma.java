package exemplo.composite.formas;

import java.awt.Graphics;

public interface Forma {
	int getX();
    int getY();
    int getLargura();
    int getAltura();
    void mover(int x, int y);
    boolean estaDentroDosLimites(int x, int y);
    void selecionar();
    void deselecionar();
    boolean estaSelecionado();
    void desenhar(Graphics grafico);
}