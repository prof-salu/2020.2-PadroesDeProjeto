package builder;

public class Diretor {
	public void construirEsportivo(Builder builder) {
		builder.setTipo(Tipo.ESPORTIVO);
		builder.setAssentos(2);
		builder.setMotor(new Motor(3.0, 0));
		builder.setTransmissao(Transmissao.SEMI_AUTOMATICO);
		builder.setComputadorDeBordo(new ComputadorDeBordo());
		builder.setNavegadorGps(new NavegadorGPS());
	}

	public void construirSedan(Builder builder) {
		builder.setTipo(Tipo.SEDAN);
		builder.setAssentos(2);
		builder.setMotor(new Motor(1.6, 0));
		builder.setTransmissao(Transmissao.AUTOMATICO);
		builder.setComputadorDeBordo(new ComputadorDeBordo());
		builder.setNavegadorGps(new NavegadorGPS());
	}

	public void construirSUV(Builder builder) {
		builder.setTipo(Tipo.SUV);
		builder.setAssentos(4);
		builder.setMotor(new Motor(2.5, 0));
		builder.setTransmissao(Transmissao.MANUAL);
		builder.setNavegadorGps(new NavegadorGPS());
	}
}
