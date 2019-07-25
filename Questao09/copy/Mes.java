package Questao09.copy;

import java.util.HashMap;
import java.util.Map;

public class Mes {
	private Map< String, Integer> meses = new HashMap();

	public Mes() {
		meses.put("Jan",1);
		meses.put("Fev",2 );
		meses.put("Mar",3);
		meses.put( "Abr",4);
		meses.put( "Mai",5);
		meses.put("Jun",6);
		meses.put( "Jul",7);
		meses.put( "Ago",8);
		meses.put("Set",9);
		meses.put( "Out",10);
		meses.put( "Nov",11);
		meses.put( "Dez",12);

	}

	public Mes(String nome) {
		this();
		procuraMesPor(nome);

	}

	private void procuraMesPor(String nome) {

		System.out.print("Mes: " + meses.get(nome));

	}

	private void procuraNumeroDoMesPor(String nome) {

		System.out.print("Mes: " + meses.get(nome));

	}

}
