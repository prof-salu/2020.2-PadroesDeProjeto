package exemplo.interpreter;

import java.util.ArrayList;
import java.util.List;

public class TesteInterpreter {

	public static void main(String[] args) {
		List<NumRomanoInterpreter> lista = new ArrayList<NumRomanoInterpreter>();
		lista.add(new MilharRomano());
		lista.add(new CentenaRomano());
		lista.add(new DezenaRomano());
		lista.add(new UnidadeRomano());
		String valorRomano = "MMXXI";
		Contexto contexto = new Contexto(valorRomano);
		for (NumRomanoInterpreter numRomanoInterpreter : lista) {
			numRomanoInterpreter.interpretar(contexto);
		}
		System.out.println(valorRomano + " = " + Integer.toString(contexto.getOutput()));
	}
}
