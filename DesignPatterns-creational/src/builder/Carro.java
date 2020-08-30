package builder;

public class Carro {
	private final Tipo tipo;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;
	private final ComputadorDeBordo computadorDeBordo;
	private final NavegadorGPS navegadorGPS;
	private double combustivel = 0;

	public Carro(Tipo tipo, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo,
			NavegadorGPS navegadorGPS) {
		this.tipo = tipo;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		this.computadorDeBordo = computadorDeBordo;
		this.computadorDeBordo.setCar(this);
		this.navegadorGPS = navegadorGPS;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setcombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public int getAssentos() {
		return assentos;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmission() {
		return transmissao;
	}

	public ComputadorDeBordo getComputadorDeBordo() {
		return computadorDeBordo;
	}

	public NavegadorGPS getNavegadorGPS() {
		return navegadorGPS;
	}
}
