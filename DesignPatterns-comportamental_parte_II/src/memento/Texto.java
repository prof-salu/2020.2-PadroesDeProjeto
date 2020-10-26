package memento;

public class Texto {
	protected String texto;
	TextoCareTaker caretaker;

	public Texto() {
		caretaker = new TextoCareTaker();
		texto = new String();
	}

	public void addTexto(String novoTexto) {
		caretaker.addMemento(new TextoMemento(texto));
		texto += novoTexto + "\n";
	}

	public void undoTexto() {
		texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void showTexto() {
		System.out.println("# " + texto);
	}
}
