package memento;

public class TesteMemento {

	public static void main(String[] args) {
		Texto texto = new Texto();
		texto.addTexto("Os padr�es de cria��o s�o aqueles que abstraem ...");
		texto.addTexto("Os padr�es estruturais se preocupam ...");
		texto.addTexto("Os padr�es de comportamento se concentram ...");
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
		texto.undoTexto();
		
		texto.showTexto();
	}
}
