package exemplo.adapter.tomada;

public class TomadaPinoRedondo {
	private double raio;

    public TomadaPinoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public boolean encaixou(PinoRedondo pino) {
        boolean encaixou;
        encaixou = (this.getRaio() >= pino.getRaio());
        return encaixou;
    }
}
