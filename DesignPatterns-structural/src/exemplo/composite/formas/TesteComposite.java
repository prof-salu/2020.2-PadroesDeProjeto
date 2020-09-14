package exemplo.composite.formas;

import java.awt.*;

public class TesteComposite {
	public static void main(String[] args) {
		EditorDeImagens editor = new EditorDeImagens();

		editor.carregarFormas(new Circulo(10, 10, 10, Color.BLUE),
				new FormaComposta(new Circulo(110, 110, 50, Color.RED), new Ponto(160, 160, Color.RED)),
				new FormaComposta(new Retangulo(250, 250, 100, 100, Color.BLACK), new Ponto(240, 240, Color.BLACK),
						new Ponto(240, 360, Color.BLACK), new Ponto(360, 360, Color.BLACK),
						new Ponto(360, 240, Color.BLACK))
		);
	}
}
