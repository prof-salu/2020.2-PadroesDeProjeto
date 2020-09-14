package exemplo.composite.formas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormaComposta extends FormaBase {
	protected List<Forma> lista = new ArrayList<>();

	public FormaComposta(Forma... formas) {
		super(0, 0, Color.black);
		add(formas);
	}

	public void add(Forma forma) {
		lista.add(forma);
	}

	public void add(Forma... formas) {
		lista.addAll(Arrays.asList(formas));
	}

	public void remove(Forma forma) {
		lista.remove(forma);
	}

	public void remove(Forma... formas) {
		lista.removeAll(Arrays.asList(formas));
	}

	public void clear() {
		lista.clear();
	}

	@Override
	public int getX() {
		if (lista.size() == 0) {
			return 0;
		}
		int x = lista.get(0).getX();
		for (Forma forma : lista) {
			if (forma.getX() < x) {
				x = forma.getX();
			}
		}
		return x;
	}

	@Override
	public int getY() {
		if (lista.size() == 0) {
			return 0;
		}
		int y = lista.get(0).getY();
		for (Forma forma : lista) {
			if (forma.getY() < y) {
				y = forma.getY();
			}
		}
		return y;
	}

	@Override
	public int getLargura() {
		int maxWidth = 0;
		int x = getX();
		for (Forma forma : lista) {
			int formasRelativeX = forma.getX() - x;
			int formaWidth = formasRelativeX + forma.getLargura();
			if (formaWidth > maxWidth) {
				maxWidth = formaWidth;
			}
		}
		return maxWidth;
	}

	@Override
	public int getAltura() {
		int maxHeight = 0;
		int y = getY();
		for (Forma forma : lista) {
			int formasRelativeY = forma.getY() - y;
			int formaHeight = formasRelativeY + forma.getAltura();
			if (formaHeight > maxHeight) {
				maxHeight = formaHeight;
			}
		}
		return maxHeight;
	}

	@Override
	public void mover(int x, int y) {
		for (Forma forma : lista) {
			forma.mover(x, y);
		}
	}

	@Override
	public boolean estaDentroDosLimites(int x, int y) {
		for (Forma forma : lista) {
			if (forma.estaDentroDosLimites(x, y)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void deselecionar() {
		super.deselecionar();
		for (Forma forma : lista) {
			forma.deselecionar();
		}
	}

	public boolean selecionarForma(int x, int y) {
		for (Forma forma : lista) {
			if (forma.estaDentroDosLimites(x, y)) {
				forma.selecionar();
				return true;
			}
		}
		return false;
	}

	@Override
	public void desenhar(Graphics grafico) {
		if (estaSelecionado()) {
			ativarSelecao(grafico);
			grafico.drawRect(getX() - 1, getY() - 1, getLargura() + 1, getAltura() + 1);
			desativarSelecao(grafico);
		}

		for (Forma forma : lista) {
			forma.desenhar(grafico);
		}
	}
}
