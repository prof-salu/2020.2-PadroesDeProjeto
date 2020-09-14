package exemplo.composite.arquivos;

public class TesteComposite {
	public static void main(String[] args) {
		ArquivoComponent video01 = new ArquivoVideo("Meu video.rmvb");
		ArquivoComponent video02 = new ArquivoVideo("Novo video.rmvb");
		ArquivoComponent pastaVideos = new ArquivoComposite("MeusVideos/");
		
		((ArquivoComposite) pastaVideos).adicionar(video01);
		((ArquivoComposite) pastaVideos).adicionar(video02);
		pastaVideos.printNomeArquivo();
	}
}
