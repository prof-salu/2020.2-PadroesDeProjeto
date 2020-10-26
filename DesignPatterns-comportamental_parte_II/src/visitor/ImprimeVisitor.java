package visitor;

public class ImprimeVisitor implements Visitor {
	
	public void visit(Carro carro) {
		System.out.println(carro);
	}

	public void visit(Onibus onibus) {
		System.out.println(onibus);
	}

	public void visit(Motocicleta motocicleta) {
		System.out.println(motocicleta);
	}
}
