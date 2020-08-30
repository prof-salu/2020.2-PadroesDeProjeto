package singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	int valor;

	private Singleton() {
		this.valor = (int) (10 * Math.random());
	}

	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}
