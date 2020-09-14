package exemplo.proxy;

public class TestaProxy {
	public static void main(String[] args) {
		System.out.println("Acesso Hacker");
		Banco banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getTotalClientes());
		System.out.println(banco.getSaldoClientes());
		System.out.println("================================");
		System.out.println("Acesso Gerente");
		banco = new BancoProxy("gerente", "gerente");
		System.out.println(banco.getTotalClientes());
		System.out.println(banco.getSaldoClientes());
	}
}
