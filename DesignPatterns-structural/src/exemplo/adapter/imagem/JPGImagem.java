package exemplo.adapter.imagem;

public class JPGImagem {
	
	public void carregarImagemJPG(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void desenharImagemJPG(int largura, int altura, int posX, int posY) {
		System.out.println("Imagem JPG desenhada");
		System.out.println("Largura: " + largura + " | Altura: " + altura);
		System.out.println("X: " + posX + " | Y: " + posY);
	}
}
