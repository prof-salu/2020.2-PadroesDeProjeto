package exemplo.mediator;

public class TesteMediator {

	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		WindowsPhoneColleague windows = new WindowsPhoneColleague(mediador);
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(ios);
		mediador.adicionarColleague(windows);
		windows.enviarMensagem("Oi, eu sou um Symbian!");
		System.out.println("================================");
		android.enviarMensagem("Oi Windows Phone! Eu sou um Android!");
		System.out.println("================================");
		ios.enviarMensagem("Olá todos, sou um iOs!");

	}

}
