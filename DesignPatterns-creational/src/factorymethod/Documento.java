package factorymethod;

public abstract class Documento {

	public void abrir() {
		System.out.println("Documento: Abrir documento!");
	}

	public void fechar() {
		System.out.println("Documento: Fechar documento!");
	}

	public void salvar() {
		System.out.println("Documento: Salvar documento!");
	}
}
