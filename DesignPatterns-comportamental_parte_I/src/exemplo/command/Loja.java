package exemplo.command;

public class Loja {
	protected String nome;

	public Loja(String nome) {
		this.nome = nome;
	}

	public void executarCompra(double valor, PagamentoCommand formaPagamento) {
		Compra compra = new Compra(nome);
		compra.setValor(valor);
		formaPagamento.processarCompra(compra);
	}
}
