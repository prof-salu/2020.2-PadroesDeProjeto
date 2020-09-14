package exemplo.proxy;

public class BancoProxy extends Banco {
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getTotalClientes() {
		if (checarPermissao()) {
			return super.getTotalClientes();
		}
		return null;
	}

	@Override
	public String getSaldoClientes() {
		if (checarPermissao()) {
			return super.getSaldoClientes();
		}
		return null;
	}

	private boolean checarPermissao() {
		return (usuario == "gerente" && senha == "gerente") ? true : false;
	}
}
