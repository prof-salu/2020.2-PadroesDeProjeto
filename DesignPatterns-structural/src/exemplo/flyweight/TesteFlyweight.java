package exemplo.flyweight;

public class TesteFlyweight {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		System.out.println("==============================");
		System.out.println("Renderizando o Cenário doJogo");
		System.out.println("==============================");
		factory.getFlyweight(EnumElementos.OBSTACULO01).desenharImagem(new Ponto(0, 0));
		factory.getFlyweight(EnumElementos.JOGADOR).desenharImagem(new Ponto(10, 10));
		factory.getFlyweight(EnumElementos.INIMIGO01).desenharImagem(new Ponto(100, 10));
		factory.getFlyweight(EnumElementos.INIMIGO01).desenharImagem(new Ponto(120, 10));
		factory.getFlyweight(EnumElementos.INIMIGO01).desenharImagem(new Ponto(140, 10));
		factory.getFlyweight(EnumElementos.OBSTACULO02).desenharImagem(new Ponto(5, 33));
		factory.getFlyweight(EnumElementos.INIMIGO02).desenharImagem(new Ponto(60, 10));
		factory.getFlyweight(EnumElementos.INIMIGO02).desenharImagem(new Ponto(50, 10));
		factory.getFlyweight(EnumElementos.INIMIGO03).desenharImagem(new Ponto(170, 10));
	}
}
