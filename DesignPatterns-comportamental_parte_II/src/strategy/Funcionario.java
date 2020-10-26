package strategy;

public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;
	
	protected double salarioBase;
	protected int cargo;
	protected String descricaoCargo;
	protected StrategyCalculoImposto strategyCalculo;

	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case DESENVOLVEDOR:
			strategyCalculo = new CalculoImposto10_15();
			descricaoCargo = "DESENVOLVEDOR";
			break;
		case DBA:
			strategyCalculo = new CalculoImposto10_15();
			descricaoCargo = "DBA";
			break;
		case GERENTE:
			strategyCalculo = new CalculoImposto15_20();
			descricaoCargo = "GERENTE";
			break;
		default:
			throw new RuntimeException("Cargo não encontrado");
		}
	}

	public double calcularSalarioImposto() {
		return strategyCalculo.calcularSalarioImposto(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getDescricaoCargo() {
		return descricaoCargo;
	}
}
