package exemplo.interpreter;

public abstract class NumRomanoInterpreter {
	public void interpretar(Contexto contexto) {
		if (contexto.getInput().length() == 0) {
			return;
		}

		// 4 e 9 tem duas casas
		if (contexto.getInput().startsWith(nove())) {
			addValorOutput(contexto, 9);
			useDuasCasasInput(contexto);
		} else if (contexto.getInput().startsWith(quatro())) {
			addValorOutput(contexto, 4);
			useDuasCasasInput(contexto);
		} else if (contexto.getInput().startsWith(cinco())) {
			addValorOutput(contexto, 5);
			useUmaCasaInput(contexto);
		}
		// valores que se repetem: III, CCC, MMM
		while (contexto.getInput().startsWith(um())) {
			addValorOutput(contexto, 1);
			useUmaCasaInput(contexto);
		}
	}

	private void useUmaCasaInput(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(1));
	}

	private void useDuasCasasInput(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(2));
	}

	private void addValorOutput(Contexto contexto, int numero) {
		contexto.setOutput(contexto.getOutput() + (numero * multiplicador()));
	}

	public abstract String um();

	public abstract String quatro();

	public abstract String cinco();

	public abstract String nove();

	public abstract int multiplicador();

}
