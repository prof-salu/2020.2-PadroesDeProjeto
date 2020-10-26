package exemplo.command;

public class Compra {
	private static int CONT;

	protected int numNotaFiscal;
	protected String nomeLoja;
	protected double valorTotal;

	public Compra(String nomeLoja) {
		this.nomeLoja = nomeLoja;
		numNotaFiscal = ++CONT;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		StringBuffer linha = new StringBuffer();
		linha.append("| Nota fiscal nº: " + numNotaFiscal + "\n");
		linha.append("| Loja: " + nomeLoja + "\n");
		linha.append("| Valor: " + valorTotal + "\n");
		return linha.toString();
	}
}
