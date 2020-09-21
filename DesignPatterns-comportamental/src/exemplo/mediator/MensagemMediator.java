package exemplo.mediator;

import java.util.ArrayList;
import java.util.List;

public class MensagemMediator implements Mediator {
	protected List<Colleague> contatos;

	public MensagemMediator() {
		contatos = new ArrayList<Colleague>();
	}

	public void adicionarColleague(Colleague colleague) {
		contatos.add(colleague);
	}

	@Override
	public void enviar(String mensagem, Colleague colleague) {
		for (Colleague contato : contatos) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
	}

	private void definirProtocolo(Colleague contato) {
		if (contato instanceof IOSColleague) {
			System.out.println("Dispositivo:..... iOS");
		} else if (contato instanceof AndroidColleague) {
			System.out.println("Dispositivo:..... Android");
		} else if (contato instanceof WindowsPhoneColleague) {
			System.out.println("Dispositivo:..... WindowsPhone");
		}
	}
}
