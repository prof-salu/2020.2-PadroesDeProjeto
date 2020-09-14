package exemplo.adapter.tomada;

public class TestaAdapter {
	public static void main(String[] args) {
		TomadaPinoRedondo buraco = new TomadaPinoRedondo(5);
		
        PinoRedondo pinoRedondo = new PinoRedondo(5);
        if (buraco.encaixou(pinoRedondo)) {
            System.out.println("O pino redondo de raio " + pinoRedondo.getRaio() +  " encaixou na tomada de tamanho " + buraco.getRaio());
        }else {
        	System.out.println("O pino redondo de raio " + pinoRedondo.getRaio() +  " NÃO encaixou na tomada de tamanho " + buraco.getRaio());
        }

        PinoQuadrado pinoPequeno = new PinoQuadrado(2);
        PinoQuadrado pinoMedio = new PinoQuadrado(5);
        PinoQuadrado pinoGrande = new PinoQuadrado(20);
        
       
        AdapterPinoQuadrado adaptadorPinoPequeno = new AdapterPinoQuadrado(pinoPequeno);
        AdapterPinoQuadrado adaptadorPinoGrande = new AdapterPinoQuadrado(pinoGrande);
        
        if (buraco.encaixou(adaptadorPinoPequeno)) {
        	System.out.println("O pino quadrado de raio " + pinoPequeno.getLargura() +  " encaixou na tomada de tamanho " + buraco.getRaio());
        }else {
        	System.out.println("O pino quadrado de raio " + pinoPequeno.getLargura() +  " NÃO encaixou na tomada de tamanho " + buraco.getRaio());
        }
        
//        if (buraco.encaixou(pinoMedio)) {
//        	System.out.println("O pino quadrado de raio " + pinoRedondo.getRaio() +  " encaixou na tomada de tamanho " + buraco.getRaio());
//        }else {
//        	System.out.println("O pino quadrado de raio " + pinoRedondo.getRaio() +  " NÃO encaixou na tomada de tamanho " + buraco.getRaio());
//        }
        
        if (buraco.encaixou(adaptadorPinoGrande)) {
        	System.out.println("O pino quadrado de raio " + adaptadorPinoGrande.getRaio() +  " encaixou na tomada de tamanho " + buraco.getRaio());
        }else {
        	System.out.println("O pino quadrado de raio " + adaptadorPinoGrande.getRaio() +  " NÃO encaixou na tomada de tamanho " + buraco.getRaio());
        }
	}
}
