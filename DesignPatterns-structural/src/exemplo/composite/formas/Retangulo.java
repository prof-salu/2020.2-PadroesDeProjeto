package exemplo.composite.formas;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends FormaBase {
	private int largura;
	private int altura;

	public Retangulo(int x, int y, int largura, int altura, Color cor) {
		super(x, y, cor);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public int getLargura() {
		return largura;
	}

	@Override
	public int getAltura() {
		return altura;
	}

	@Override
	public void desenhar(Graphics graficos) {
		super.desenhar(graficos);
		graficos.drawRect(x, y, getLargura() - 1, getAltura() - 1);
	}
}
