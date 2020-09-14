package exemplo.composite.arquivos;

import java.util.ArrayList;
import java.util.List;

public class ArquivoComposite extends ArquivoComponent {
	protected List<ArquivoComponent> listaArquivos;

	public ArquivoComposite(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listaArquivos = new ArrayList<ArquivoComponent>();
	}

	@Override
	public void printNomeArquivo() {
		System.out.println(this.nomeArquivo);
		for (ArquivoComponent arquivoTmp : listaArquivos) {
			arquivoTmp.printNomeArquivo();
		}
	}

	public void adicionar(ArquivoComponent novoArquivo) {
		this.listaArquivos.add(novoArquivo);
	}

	public void remover(String nomeArquivo) throws Exception {
		for (ArquivoComponent temporario : listaArquivos) {
			if (temporario.getNomeArquivo() == nomeArquivo) {
				this.listaArquivos.remove(temporario);
				return;
			}
		}
		throw new Exception("Este arquivo não existe");
	}

	public ArquivoComponent getArquivo(String nomeArquivo) throws Exception {
		for (ArquivoComponent temporario : listaArquivos) {
			if (temporario.getNomeArquivo() == nomeArquivo) {
				return temporario;
			}
		}
		throw new Exception("Este arquivo não existe");
	}
}
