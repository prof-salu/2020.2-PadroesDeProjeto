package factorymethod;

public abstract class Aplicacao {
	private Documento doc; 
	// Abstração do Factory Method
	public abstract Documento criaDocumento();

	public void novoDocumento() {
		this.doc = this.criaDocumento();
	}

	public void abrirDocumento() {
		this.doc.abrir();
	}
}
