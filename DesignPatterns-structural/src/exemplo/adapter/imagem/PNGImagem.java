package exemplo.adapter.imagem;

public class PNGImagem {
	public void carregarImagemPng(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void desenharImagemPng(int largura, int altura, int posX, int posY) {
		System.out.println("Imagem PNG desenhada");
		System.out.println("Largura: " + largura + " | Altura: " + altura);
		System.out.println("X: " + posX + " | Y: " + posY);
	}
}
