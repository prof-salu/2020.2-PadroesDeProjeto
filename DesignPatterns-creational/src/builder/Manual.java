package builder;

public class Manual {
	private final Tipo tipo;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;
	private final ComputadorDeBordo computadorDeBordo;
	private final NavegadorGPS navegadorGPS;

	public Manual(Tipo tipo, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo,
			NavegadorGPS navegadorGPS) {
		this.tipo = tipo;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		this.computadorDeBordo = computadorDeBordo;
		this.navegadorGPS = navegadorGPS;
	}

	public String print() {
		String info = "";
		info += "Tipo de carro: " + tipo + "\n";
		info += "Numero de assentos: " + assentos + "\n";
		info += "Motor: [volume: " + motor.getVolume() + " | Quilometragem: " + motor.getQuilometragem() + "]\n";
		info += "Transmissão: " + transmissao + "\n";
		if (this.computadorDeBordo != null) {
			info += "Computador de bordo: Funcionando" + "\n";
		} else {
			info += "Computador de bordo: N/A" + "\n";
		}
		if (this.navegadorGPS != null) {
			info += "Navegador GPS: Funcionando" + "\n";
		} else {
			info += "Navegador GPS: N/A" + "\n";
		}
		return info;
	}
}
