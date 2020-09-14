package exemplo.composite.formas;

import java.awt.Color;
import java.awt.Graphics;

public class Ponto extends FormaBase{
	private final int TAMANHO = 3;

    public Ponto(int x, int y, Color cor) {
        super(x, y, cor);
    }

    @Override
    public int getLargura() {
        return TAMANHO;
    }

    @Override
    public int getAltura() {
        return TAMANHO;
    }

    @Override
    public void desenhar(Graphics grafico) {
        super.desenhar(grafico);
        grafico.fillRect(x - 1, y - 1, getLargura(), getAltura());
    }
}
