package Questao08;

import java.util.Scanner;

public class TesteMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um numero do Mes");
		Scanner teclado = new Scanner(System.in);
		int dado = teclado.nextInt();

		Mes mes = new Mes(dado);

	}

}
