package exemplo.adapter.imagem;

public class JPGImagemAdapter extends JPGImagem implements IImagem {

	@Override
	public void carregarImagem(String arquivo) {
		carregarImagemJPG(arquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		desenharImagemJPG(largura, altura, posX, posY);
	}

}
