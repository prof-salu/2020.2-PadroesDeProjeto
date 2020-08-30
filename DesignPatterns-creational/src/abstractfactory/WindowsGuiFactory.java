package abstractfactory;

public class WindowsGuiFactory extends GuiFactory {

	@Override
	public Botao criarBotao() {
		return new BotaoWindows();
	}

	@Override
	public Janela criarJanela() {
		return new JanelaWindows();
	}

}
