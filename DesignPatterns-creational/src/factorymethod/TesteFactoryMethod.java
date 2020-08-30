package factorymethod;

public class TesteFactoryMethod {
	public static void main(String[] args) {
		MinhaAplicacao app = new MinhaAplicacao();
		Documento doc = app.criaDocumento();
		
		doc.abrir();
		
		MeuDocumento myDoc = new MeuDocumento();
		
		System.out.println("Documento: " + myDoc.getWord());
		//System.out.println("Documento: " + myDoc.getExcel());
	}
}
