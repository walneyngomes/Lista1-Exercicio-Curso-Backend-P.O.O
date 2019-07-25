package Questao05;

public class Comparador {
	private double numeroUm, numeroDois, numeroTres;

	public double comparadorNumero() {
		double[] numero = { this.getNumeroDois(), this.getNumeroTres(), this.getNumeroUm() };

		double valor = numero[0];
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length-1; j++) {
				if ((valor < numero[j])) {
					valor = numero[j];
				} 

			}

		}

		return valor;
	}

	private int combinarDisticaoDe(int valor) {
		return valor * (valor - 1);

	}

	public double getNumeroTres() {
		return numeroTres;
	}

	public void setNumeroTres(double numeroTres) {
		this.numeroTres = numeroTres;
	}

	public double getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(double numeroDois) {
		this.numeroDois = numeroDois;
	}

}
