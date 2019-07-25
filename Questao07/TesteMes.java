package Questao07;

import java.util.Scanner;

public class TesteMes {
	
	public static void main(String[] args) {
		
		// WALNEY NEGREIROS GOMES
		//
		Mes mes = new Mes();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o NUMERO do mes:");
		int numeroMes = teclado.nextInt();
		mes.setMes(numeroMes);
		System.out.print(mes.buscaPor());
		teclado.close();

	}

}
