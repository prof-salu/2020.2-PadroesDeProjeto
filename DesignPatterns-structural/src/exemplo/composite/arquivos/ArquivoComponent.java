package exemplo.composite.arquivos;

public abstract class ArquivoComponent {
	String nomeArquivo;

	public String getNomeArquivo() {
		return this.nomeArquivo;
	}

	public void printNomeArquivo() {
		System.out.println(this.nomeArquivo);
	}
}
