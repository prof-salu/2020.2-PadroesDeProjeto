package exemplo.command;

public class PagamentoCartaoDeCredito implements PagamentoCommand {
	private int qtdParcelas;

	public PagamentoCartaoDeCredito(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	@Override
	public void processarCompra(Compra compra) {
		System.out.println(compra.getInfoNota() + "| Forma de Pagamento: ... Cartao de Credito");
		System.out.println("| Quantidade de Parcelas: ..." + qtdParcelas);
	}
}
