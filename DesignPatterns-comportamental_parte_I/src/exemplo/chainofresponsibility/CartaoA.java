package exemplo.chainofresponsibility;

public class CartaoA extends PagamentoChain {
	public CartaoA() {
		super(EnumPagamentos.CARTAOA);
	}

	@Override
	protected void efetuarPagamento() {
		System.out.println("Pagamento efetuado: Cartão A");
	}
}
