package observer;

import java.text.DecimalFormat;

public class PercentualObserver extends DadosObserver {
	public PercentualObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		int totalValores = dados.getState().valorA + dados.getState().valorB + dados.getState().valorC;
		DecimalFormat format = new DecimalFormat("#.##");
		String porcentagemA = format.format((double) dados.getState().valorA / totalValores);
		String porcentagemB = format.format((double) dados.getState().valorB / totalValores);
		String porcentagemC = format.format((double) dados.getState().valorC / totalValores);
		
		System.out.println();
		System.out.println("Porcentagem:");
		System.out.println("Valor A: " + porcentagemA + "%");
		System.out.println("Valor B: " + porcentagemB + "%");
		System.out.println("Valor C: " + porcentagemC + "%");
		System.out.println();

	}
}