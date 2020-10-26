package visitor;

public class TestaVisitor {
	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento();
		
		estacionamento.addVeiculo(new Carro("ABC123"));
		estacionamento.addVeiculo(new Onibus("EFG456"));
		estacionamento.addVeiculo(new Motocicleta("HIJ789"));
		estacionamento.addVeiculo(new Carro("LMN012"));

		estacionamento.veiculosEstacionados();
	}
}
