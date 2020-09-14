package exemplo.composite.formas;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends FormaBase{
	private int raio;
	
	public Circulo(int x, int y, int raio, Color cor) {
		super(x, y, cor);
		this.raio = raio;
	}
	
	@Override
    public int getLargura() {
        return raio * 2;
    }

    @Override
    public int getAltura() {
        return raio * 2;
    }

    public void desenhar(Graphics grafico) {
        super.desenhar(grafico);
        grafico.drawOval(x, y, getLargura() - 1, getAltura() - 1);
    }

}
