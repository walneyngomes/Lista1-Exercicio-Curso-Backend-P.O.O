package Questao10;

import java.util.Scanner;

public class TesteMes {
	public static void main(String[] args) {

		Mes mes = new Mes();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ano");
		int dado = teclado.nextInt();
		mes.setAno(dado);
		System.out.println("Dia");
		dado = teclado.nextInt();
		mes.setNumeroMes(dado);

		System.out.println("Quantidade de dias do mes" + " " + mes.getNumeroMes() + " " + "Ano" + mes.getAno() + " "
				+ "é:" + "" + mes.quantidadeDeDiasMes());

	}

}
