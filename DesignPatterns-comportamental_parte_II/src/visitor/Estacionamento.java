package visitor;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<Veiculo> lista;
	private ImprimeVisitor visitor;
	
	public Estacionamento() {
		lista = new ArrayList<>();
		visitor = new ImprimeVisitor();
	}
	
	public void addVeiculo(Veiculo veiculo) {
		lista.add(veiculo);
	}
	
	public void veiculosEstacionados() {
		for (Veiculo veiculo : lista) {
			veiculo.accept(visitor);
		}
	}
	
}
