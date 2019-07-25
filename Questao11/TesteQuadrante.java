package Questao11;

import java.util.Scanner;

public class TesteQuadrante {
	public static void main(String[] args) {

		Quadrante quadrante = new Quadrante();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Valor do angulo:");
		int valorAngulo = teclado.nextInt();
		quadrante.setNumero(valorAngulo);
		System.out.print("Esta posicionado no" + quadrante.informarQuadrante());
		teclado.close();
	}

}
