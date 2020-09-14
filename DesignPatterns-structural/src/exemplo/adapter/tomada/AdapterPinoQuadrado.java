package exemplo.adapter.tomada;

public class AdapterPinoQuadrado extends PinoRedondo{
	private PinoQuadrado pino;

    public AdapterPinoQuadrado(PinoQuadrado pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {
        double resultado;
        
        resultado = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return resultado;
    }
}
