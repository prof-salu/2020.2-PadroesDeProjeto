package strategy;

public class CalculoImposto15_20 implements StrategyCalculoImposto {
	@Override
	public double calcularSalarioImposto(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3500) {
			return funcionario.getSalarioBase() * 0.8;
		}
		return funcionario.getSalarioBase() * 0.85;
	}
}
