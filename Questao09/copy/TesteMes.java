package Questao09.copy;

import java.util.Scanner;

public class TesteMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um nome do Mes");
		Scanner teclado = new Scanner(System.in);
		String dado = teclado.nextLine();

		Mes mes = new Mes(dado);

	}

}
