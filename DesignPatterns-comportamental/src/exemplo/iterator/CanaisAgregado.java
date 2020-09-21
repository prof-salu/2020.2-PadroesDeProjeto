package exemplo.iterator;

import java.util.ArrayList;
import java.util.List;

public class CanaisAgregado {
	protected List<Canal> canais;

	public CanaisAgregado() {
		canais = new ArrayList<Canal>();
	}

	public int count() {
		return canais.size();
	}

	public IteratorCanais criarIterator() {
		return new IteratorCanais(canais);
	}
}
