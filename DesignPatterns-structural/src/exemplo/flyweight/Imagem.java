package exemplo.flyweight;

public class Imagem {
	protected String nomeImagem;

	public Imagem(String imagem) {
		nomeImagem = imagem;
	}

	public void desenharImagem() {
		System.out.print(nomeImagem + desenharPontinhos() + " Criado");
	}

	public String desenharPontinhos() {
		String pontos = "";
		int tamanho = 22 - nomeImagem.length();
		for (int i = 0; i < tamanho; i++) {
			pontos += ".";
		}
		return pontos;
	}
}
