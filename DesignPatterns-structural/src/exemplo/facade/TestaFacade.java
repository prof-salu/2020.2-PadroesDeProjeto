package exemplo.facade;

public class TestaFacade {
	public static void main(String[] args) {
		Facade facade = new Facade();
		System.out.println("====================");
		facade.getFuncionario();
		System.out.println("====================");
		facade.getCargo();
		System.out.println("====================");
		facade.getSetor();
	}
}
