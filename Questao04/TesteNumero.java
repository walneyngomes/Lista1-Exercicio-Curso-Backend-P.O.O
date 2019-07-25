package Questao04;

import java.util.Scanner;

public class TesteNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparador comparador = new Comparador();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite numero:");
		double dadoUm = teclado.nextInt();
		comparador.setNumeroUm(dadoUm);
		System.out.println("Digite numero:");
		dadoUm = teclado.nextInt();
		comparador.setNumeroDois(dadoUm);

		System.out.println("Menor valor" + comparador.comparadorNumero());

	}

}
