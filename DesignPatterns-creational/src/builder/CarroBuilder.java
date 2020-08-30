package builder;

public class CarroBuilder implements Builder {
	private Tipo tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private NavegadorGPS navegadorGPS;
	
	@Override
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	@Override
	public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
		this.computadorDeBordo = computadorDeBordo;
	}

	@Override
	public void setNavegadorGps(NavegadorGPS navegadorGPS) {
		this.navegadorGPS = navegadorGPS;
	}

	public Carro getResultado() {
		return new Carro(tipo, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
	}
}
