package Questao07;

import java.util.HashMap;
import java.util.Map;

public class Mes {

	Map meses = new HashMap();

	private int mes;

	public Mes() {
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Marco");
		meses.put(4, "Abril");
		meses.put(5, "Maio");
		meses.put(6, "Junho");
		meses.put(7, "Julho");
		meses.put(8, "Agosto");
		meses.put(9, "Setembro");
		meses.put(10, "Outubro");
		meses.put(11, "Novembro");
		meses.put(12, "Dezembro");

	}

	public String buscaPor() {

		return (String) meses.get(this.getMes());
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}
