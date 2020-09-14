package exemplo.flyweight;

import java.util.ArrayList;

public class FlyweightFactory {
	protected ArrayList<ElementoFlyweight> flyweights;

	public FlyweightFactory() {
		flyweights = new ArrayList<ElementoFlyweight>();
		flyweights.add(new Elemento("jogador.png"));
		flyweights.add(new Elemento("inimigo01.png"));
		flyweights.add(new Elemento("inimigo02.png"));
		flyweights.add(new Elemento("inimigo03.png"));
		flyweights.add(new Elemento("obstaculo01.png"));
		flyweights.add(new Elemento("obstaculo02.png"));
	}

	public ElementoFlyweight getFlyweight(EnumElementos componente) {
		switch (componente) {
		case JOGADOR:
			return flyweights.get(0);
		case INIMIGO01:
			return flyweights.get(1);
		case INIMIGO02:
			return flyweights.get(2);
		case INIMIGO03:
			return flyweights.get(3);
		case OBSTACULO01:
			return flyweights.get(4);
		default:
			return flyweights.get(5);
		}
	}
}
