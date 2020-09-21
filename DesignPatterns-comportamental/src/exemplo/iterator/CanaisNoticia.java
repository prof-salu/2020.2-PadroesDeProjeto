package exemplo.iterator;

public class CanaisNoticia extends CanaisAgregado {
	public CanaisNoticia() {
		canais.add(new Canal("Blogger News", 11));
		canais.add(new Canal("Plantão de Noticias", 3));
		canais.add(new Canal("Gazeta Espetacular", 21));
		canais.add(new Canal("Esporte Total", 41));
	}
}
