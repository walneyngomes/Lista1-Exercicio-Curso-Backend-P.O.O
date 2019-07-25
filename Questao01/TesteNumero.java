package Questao01;

import java.util.Scanner;

public class TesteNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int dado = teclado.nextInt();
		Numero numero = new Numero(3);
		teclado.close();
	}

}
