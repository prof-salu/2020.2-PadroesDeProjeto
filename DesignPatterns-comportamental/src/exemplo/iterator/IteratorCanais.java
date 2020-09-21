package exemplo.iterator;

import java.util.List;

public class IteratorCanais {
	List<Canal> lista;
	int contador;

	protected IteratorCanais(List<Canal> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximoCanal() {
		contador++;
	}

	public void voltarCanal() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private Canal currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomeCanal() {
		return currentItem().nome;
	}

	public int getNumeroCanal() {
		return currentItem().numero;
	}
}
