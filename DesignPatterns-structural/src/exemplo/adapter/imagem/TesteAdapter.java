package exemplo.adapter.imagem;

public class TesteAdapter {

	public static void main(String[] args) {
		IImagem imagem = new JPGImagemAdapter();
		imagem.carregarImagem("imagem.png");
		imagem.desenharImagem(1, -5, 10, 10);
		System.out.println("==================================");
		imagem = new PNGImagemAdapter();
		imagem.carregarImagem("imagem.png");
		imagem.desenharImagem(3, 8, 10, 100);
	}
}
