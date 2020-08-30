package builder;

public class ComputadorDeBordo {
	private Carro carro;

    public void setCar(Carro carro) {
        this.carro = carro;
    }

    public void exibirQuantidadeCombustivel() {
        System.out.println("Quantidade de combustivel: " + carro.getCombustivel());
    }

    public void showStatus() {
        if (this.carro.getMotor().estaLigado()) {
            System.out.println("O carro está ligado");
        } else {
            System.out.println("O carro não está ligado");
        }
    }
}
