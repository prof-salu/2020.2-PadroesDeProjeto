package builder;

import java.util.ArrayList;
import java.util.List;

public class LeitorRTF {
	private ConversorTexto conversor;

	public LeitorRTF(ConversorTexto c) {
		this.conversor = c;
	}

	public void lerRTF() {
		List<Token> tokens = obterTokensDoTexto();
		for (Token t : tokens) {
			if (t.getTipo() == Token.Tipo.CARACTERE) {
				conversor.converterCaractere(t.getCaractere());
			}
			if (t.getTipo() == Token.Tipo.PARAGRAFO) {
				conversor.converterParagrafo();
			}
			if (t.getTipo() == Token.Tipo.FONTE) {
				conversor.converterFonte(t.getFonte());
			}
		}
		
		System.out.println("Leitura efetuada");
	}

	private List<Token> obterTokensDoTexto() {
		return new ArrayList<Token>();
	}
}
