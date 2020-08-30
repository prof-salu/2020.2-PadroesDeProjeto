package builder;

public class TesteBuilder {
	public static void main(String[] args) {
		ConversorTexto conversor;
		String[] arquivo = {"pdf", "tex", "ascii"};
		
		if (arquivo[0].equals("pdf")) {
			conversor = new ConversorPDF();
		} else if (arquivo[0].equals("tex")) {
			conversor = new ConversorTeX();
		} else {
			conversor = new ConversorASCII();
		}
		
		LeitorRTF leitor = new LeitorRTF(conversor);
		leitor.lerRTF();
	}
}
