package Questao02;

import java.util.Scanner;

public class TesteNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero numero = new Numero();
		Scanner teclado = new Scanner(System.in);

		int dado = teclado.nextInt();

		numero.setNumero(dado);
		System.out.print(numero.calcularValorAbsoluto());
	}

}
