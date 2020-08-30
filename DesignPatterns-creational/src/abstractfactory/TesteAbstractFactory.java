package abstractfactory;

public class TesteAbstractFactory {
	public static void main(String[] args) {
		GuiFactory factory = GuiFactory.obterFactory();
		Botao botao = factory.criarBotao();
		Janela janela = factory.criarJanela();
		botao.desenhar();
		janela.desenhar();		
	}
}