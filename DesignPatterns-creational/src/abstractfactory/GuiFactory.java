package abstractfactory;

public abstract class GuiFactory {

	public static GuiFactory obterFactory() {
		String nomeSO = System.getProperty("os.name").toLowerCase();
		
		if (nomeSO.contains("mac")) {
			return new MacGuiFactory();
		} else {
			return new WindowsGuiFactory();
		}
	}

	public abstract Botao criarBotao();

	public abstract Janela criarJanela();
}
