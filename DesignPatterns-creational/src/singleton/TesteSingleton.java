package singleton;

public class TesteSingleton {
	public static void main(String[] args) {
		Singleton singleton = null;
		singleton = Singleton.getInstance();
		System.out.println("Classe Singleton instanciada, inicializada com o valor:");
		System.out.println(singleton.valor);
	}
}
