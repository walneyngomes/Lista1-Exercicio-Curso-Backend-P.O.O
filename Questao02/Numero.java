package Questao02;

public class Numero {
	private static final int NUMERO = -1;
	private int numero;

	public int calcularValorAbsoluto() {
		return this.getNumero() * NUMERO;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
