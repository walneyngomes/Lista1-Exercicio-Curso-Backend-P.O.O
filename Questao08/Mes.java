package Questao08;

import java.util.HashMap;
import java.util.Map;

public class Mes {
	private Map<Integer, String> meses = new HashMap();

	public Mes() {
		meses.put(1, "Jan");
		meses.put(2, "Fev");
		meses.put(3, "Mar");
		meses.put(4, "Abr");
		meses.put(5, "Mai");
		meses.put(6, "Jun");
		meses.put(7, "Jul");
		meses.put(8, "Ago");
		meses.put(9, "Set");
		meses.put(10, "Out");
		meses.put(11, "Nov");
		meses.put(12, "Dez");

	}

	public Mes(int numero) {
		this();
		procuraMesPor(numero);

	}

	private void procuraMesPor(int valor) {

		System.out.print("Mes: " + meses.get(valor));

	}

}
