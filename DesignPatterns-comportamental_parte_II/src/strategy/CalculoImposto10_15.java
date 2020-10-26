package strategy;

public class CalculoImposto10_15 implements StrategyCalculoImposto {
	@Override
	public double calcularSalarioImposto(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000) {
			return funcionario.getSalarioBase() * 0.85;
		}
		return funcionario.getSalarioBase() * 0.9;
	}
}
