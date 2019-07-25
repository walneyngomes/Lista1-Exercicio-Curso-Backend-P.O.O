package Questao13;

import java.util.Scanner;

public class TesteTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo triangulo = new Triangulo();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Lado A");
		double dadoLadoA = teclado.nextDouble();
		System.out.println("Lado B");
		double dadoLadoB = teclado.nextDouble();

		System.out.println("Lado C");
		double dadoLadoC = teclado.nextDouble();

		triangulo.getLados()[0] = dadoLadoA;
		triangulo.getLados()[1] = dadoLadoB;
		triangulo.getLados()[2] = dadoLadoC;
		teclado.close();
		System.out.println("Isso é triangulo?" + triangulo.verificaTriagulo());

	}

}
