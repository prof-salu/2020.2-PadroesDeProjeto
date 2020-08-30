package abstractfactory;

public class MacGuiFactory extends GuiFactory {

	@Override
	public Botao criarBotao() {
		return new BotaoMac();
	}

	@Override
	public Janela criarJanela() {
		return new JanelaMac();
	}
}
