package Questao10;

import java.util.HashMap;
import java.util.Map;

public class Mes {
	private int numeroMes;
	private int ano;

	Map<Integer, Integer> meses = new HashMap();

	public Mes() {
		this.meses.put(1, 31);
		this.meses.put(2, 28);
		this.meses.put(3, 30);
		this.meses.put(4, 30);
		this.meses.put(5, 31);
		this.meses.put(6, 30);
		this.meses.put(7, 31);
		this.meses.put(8, 31);
		this.meses.put(9, 30);
		this.meses.put(10, 31);
		this.meses.put(11, 30);
		this.meses.put(12, 31);

	}

	public int quantidadeDeDiasMes() {
		int quantidade = 31;
		if (this.getNumeroMes() == 2 && esBissexto()) {
			quantidade = 28;
		} else if (this.getNumeroMes() == 2 && !esBissexto()) {
			this.meses.get(this.getNumeroMes());
		}
		return quantidade;

	}

	private boolean esBissexto() {
		boolean bissexto = false;

		if (this.getAno() % 400 == 0) {
			bissexto = true;
			// se o ano for menor que 400
		} else if ((this.getAno() % 4 == 0) && (this.getAno() % 100 != 0)) {
			bissexto = false;
			;
		} else {
			bissexto = false;
		}
		return bissexto;

	}

	public int getNumeroMes() {
		return numeroMes;
	}

	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
