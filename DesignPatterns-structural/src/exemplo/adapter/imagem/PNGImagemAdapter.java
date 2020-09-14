package exemplo.adapter.imagem;

public class PNGImagemAdapter extends PNGImagem implements IImagem {

	@Override
	public void carregarImagem(String arquivo) {
		carregarImagemPng(arquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		desenharImagemPng(largura, altura, posX,posY);
	}

}
