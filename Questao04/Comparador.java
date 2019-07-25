package Questao04;

public class Comparador {
	private double numeroUm, numeroDois;

	public double comparadorNumero() {
		double numero = this.getNumeroDois();
		if (this.getNumeroUm() < numero) {
			numero = this.getNumeroUm();
		}
		return numero;
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
