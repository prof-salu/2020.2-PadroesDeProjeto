package exemplo.command;

public class PagamentoBoleto implements PagamentoCommand {
	@Override
	public void processarCompra(Compra compra) {
		System.out.println(compra.getInfoNota() + 
										"| Forma de Pagamento: ... Boleto");
	}
}
