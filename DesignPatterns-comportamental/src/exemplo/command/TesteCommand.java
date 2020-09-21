package exemplo.command;

public class TesteCommand {
	public static void main(String[] args) {
		Loja baratao = new Loja("Baratão");
		baratao.executarCompra(999.00, new PagamentoCartaoDeCredito(2));
		System.out.println("==============================");
		baratao.executarCompra(49.00, new PagamentoBoleto());
		System.out.println("==============================");
		baratao.executarCompra(99.00, new PagamentoCartaoDeDebito());
		System.out.println("==============================");
		Loja joaoEletro = new Loja("JoãoEletro");
		joaoEletro.executarCompra(19.00, new PagamentoCartaoDeCredito(3));
	}
}
