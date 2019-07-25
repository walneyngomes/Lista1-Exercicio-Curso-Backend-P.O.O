package Questao14;

import java.util.Scanner;

public class TesteTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		FactoryTriangulo fabrica = new FactoryTriangulo();
		System.out.println("LADO A");
		double dado1 = teclado.nextDouble();
		System.out.println("LADO B");

		double dado2 = teclado.nextDouble();
		System.out.println("LADO C");

		double dado3 = teclado.nextDouble();
		try {
			fabrica.criarTrianguloPor(dado1, dado2, dado3).nome();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		;

	}

}
