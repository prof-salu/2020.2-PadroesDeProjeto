package exemplo.iterator;

public class TesteIterator {
	public static void main(String[] args) {
		CanaisNoticia canais = new CanaisNoticia();
		System.out.println("==========================");
		System.out.println("Iterando com for:");
		System.out.println("==========================");
		
		for (IteratorCanais it = canais.criarIterator(); !it.isDone(); it.proximoCanal()) {
			System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		}
		
		System.out.println("==========================");
		System.out.println("Iterando manualmente: ");
		System.out.println("==========================");
		IteratorCanais it = canais.criarIterator();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		System.out.println("\nIterando além doslimites:");
		it.proximoCanal();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
		it.first();
		it.voltarCanal();
		System.out.println(it.getNumeroCanal() + "–" + it.getNomeCanal());
	}
}
