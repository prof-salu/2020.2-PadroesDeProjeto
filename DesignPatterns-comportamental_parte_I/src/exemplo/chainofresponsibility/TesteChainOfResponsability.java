package exemplo.chainofresponsibility;

public class TesteChainOfResponsability {

	public static void main(String[] args) {
		PagamentoChain bancos = new CartaoA();
		bancos.setProximo(new CartaoB());
		bancos.setProximo(new Boleto());
		try {
			bancos.efetuarPagamento(EnumPagamentos.BOLETO);
			bancos.efetuarPagamento(EnumPagamentos.CARTAOA);
			bancos.efetuarPagamento(EnumPagamentos.CARTAOB);
			bancos.efetuarPagamento(EnumPagamentos.CARTAOC);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
