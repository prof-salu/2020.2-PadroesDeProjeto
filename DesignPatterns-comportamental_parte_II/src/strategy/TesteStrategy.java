package strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		try {
			Funcionario func01 = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
			System.out.println("Cargo: " + func01.getDescricaoCargo());
			System.out.println("Salario Bruto: " + func01.getSalarioBase());
			System.out.println("Salario Liquido: " + func01.calcularSalarioImposto());
			System.out.println("=====================================");

			Funcionario func02 = new Funcionario(Funcionario.DBA, 1700);
			System.out.println("Cargo: " + func02.getDescricaoCargo());
			System.out.println("Salario Bruto: " + func02.getSalarioBase());
			System.out.println("Salario Liquido: " + func02.calcularSalarioImposto());
			System.out.println("=====================================");

			Funcionario func03 = new Funcionario(Funcionario.GERENTE, 10000);
			System.out.println("Cargo: " + func03.getDescricaoCargo());
			System.out.println("Salario Bruto: " + func03.getSalarioBase());
			System.out.println("Salario Liquido: " + func03.calcularSalarioImposto());
			System.out.println("=====================================");
		} catch (RuntimeException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
