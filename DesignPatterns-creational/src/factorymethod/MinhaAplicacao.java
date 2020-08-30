package factorymethod;

public class MinhaAplicacao extends Aplicacao {

	@Override    
	public Documento criaDocumento() { 
		return new MeuDocumento();
	}
}
