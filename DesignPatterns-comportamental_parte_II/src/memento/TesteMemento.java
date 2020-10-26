package memento;

public class TesteMemento {

	public static void main(String[] args) {
		Texto texto = new Texto();
		texto.addTexto("Os padrões de criação são aqueles que abstraem ...");
		texto.addTexto("Os padrões estruturais se preocupam ...");
		texto.addTexto("Os padrões de comportamento se concentram ...");
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
	}
}
