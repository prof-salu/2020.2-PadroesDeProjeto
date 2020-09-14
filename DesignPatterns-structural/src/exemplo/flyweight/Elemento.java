package exemplo.flyweight;


public class Elemento extends ElementoFlyweight {
	protected Imagem imagem;

	public Elemento(String nomeImagem) {
		imagem = new Imagem(nomeImagem);
	}

	@Override
	public void desenharImagem(Ponto ponto) {
		imagem.desenharImagem();
		System.out.println(" => Ponto (" + ponto.x + "," + ponto.y + ")");
	}
}
