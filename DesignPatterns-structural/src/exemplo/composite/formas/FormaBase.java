package exemplo.composite.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FormaBase implements Forma {
	public int x;
    public int y;
    public Color cor;
    private boolean selecionado = false;
    
    public FormaBase(int x, int y, Color cor) {
		this.x = x;
		this.y = y;
		this.cor = cor;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getLargura() {
		return 0;
	}

	@Override
	public int getAltura() {
		return 0;
	}

	@Override
	public void mover(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public boolean estaDentroDosLimites(int x, int y) {
		return x > getX() && x < (getX() + getLargura()) &&
                y > getY() && y < (getY() + getAltura());
	}

	@Override
	public void selecionar() {
		selecionado = true;
	}

	@Override
	public void deselecionar() {
		selecionado = false;
	}

	@Override
	public boolean estaSelecionado() {
		return selecionado;
	}

	
	
	public void ativarSelecao(Graphics grafico) {
        grafico.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) grafico;
        float linha[] = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, linha, 0.0f));
    }

    public void desativarSelecao(Graphics grafico) {
        grafico.setColor(cor);
        Graphics2D g2 = (Graphics2D) grafico;
        g2.setStroke(new BasicStroke());
    }
    
    @Override
	public void desenhar(Graphics grafico) {
		if (estaSelecionado()) {
            ativarSelecao(grafico);
        }
        else {
            desativarSelecao(grafico);
        }
	}
}
