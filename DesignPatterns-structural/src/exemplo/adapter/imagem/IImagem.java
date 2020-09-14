package exemplo.adapter.imagem;

public interface IImagem {
	void carregarImagem(String arquivo);
	void desenharImagem(int posX, int posY, int largura, int altura);
}
