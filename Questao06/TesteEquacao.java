package Questao06;

import java.util.Scanner;

public class TesteEquacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
		Scanner teclado = new Scanner(System.in);
		System.out.print("A");
		double dado = teclado.nextDouble();
		equacao.setA(dado);
		System.out.print("B");
		dado = teclado.nextDouble();
		equacao.setB(dado);
		System.out.print("C");
		dado = teclado.nextDouble();
		equacao.setC(dado);

		System.out.println("Delta:" + equacao.deltaCalcule());
		System.out.println("x1:" + equacao.x1());
		System.out.println("x2:" + equacao.x2());
		System.out.print("EQUACAO:"+equacao.equcaoSistemasFormula());
  
		
	}

}
