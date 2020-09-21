package exemplo.chainofresponsibility;

public abstract class PagamentoChain {
	protected PagamentoChain proximo;
	protected EnumPagamentos idBanco;

	public PagamentoChain(EnumPagamentos banco) {
		proximo = null;
		idBanco = banco;
	}

	public void setProximo(PagamentoChain forma) {
		if (proximo == null) {
			proximo = forma;
		} else {
			proximo.setProximo(forma);
		}
	}

	public void efetuarPagamento(EnumPagamentos banco) throws Exception {
		if (verificarPagamento(banco)) {
			efetuarPagamento();
		} else {
			if (proximo == null) {
				throw new Exception(banco + ": .......Forma de Pagamento Não Cadastrada");
			}
			proximo.efetuarPagamento(banco);
		}
	}

	private boolean verificarPagamento(EnumPagamentos banco) {
		if (idBanco == banco) {
			return true;
		}
		return false;
	}

	protected abstract void efetuarPagamento();

}
