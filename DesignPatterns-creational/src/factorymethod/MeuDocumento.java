package factorymethod;

public class MeuDocumento extends Documento {
	private String word = "Word";
	private String excel = "Excel";

	String getWord() {
		return this.word;
	}

	String getExcel() {
		return this.excel;
	}
}
