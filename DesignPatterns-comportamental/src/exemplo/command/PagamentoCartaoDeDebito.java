package exemplo.command;

public class PagamentoCartaoDeDebito implements PagamentoCommand {
	@Override
	public void processarCompra(Compra compra) {
		System.out.println(compra.getInfoNota() + "| Forma de Pagamento: ... Cartao de Debito");
	}
}
