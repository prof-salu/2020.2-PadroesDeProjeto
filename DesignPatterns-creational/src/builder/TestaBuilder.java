package builder;

public class TestaBuilder {
	public static void main(String[] args) {
        Diretor diretor = new Diretor();

        CarroBuilder builder = new CarroBuilder();
        diretor.construirEsportivo(builder);
        
        Carro car = builder.getResultado();
        System.out.println("Caro construido:\n" + car.getTipo());

        ManualBuilder manualBuilder = new ManualBuilder();

        diretor.construirEsportivo(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual do carro:\n" + carManual.print());
    }
}
