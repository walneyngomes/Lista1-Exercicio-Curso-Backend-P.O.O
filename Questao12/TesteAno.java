package Questao12;

import java.util.Scanner;

public class TesteAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ano ano = new Ano();
		Scanner teclado = new Scanner(System.in);
		int dadoAno = teclado.nextInt();
		ano.setAno(dadoAno);
		System.out.println("EsBissexto" + ano.isBissexto());
		teclado.close();
	}

}
