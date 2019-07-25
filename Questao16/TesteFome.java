package Questao16;

import java.util.Scanner;

public class TesteFome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fome fome = new Fome();
Scanner teclado = new Scanner(System.in);
		System.out.print("Hora");
		int dadoHora = teclado.nextInt();
		fome.setHora(dadoHora);
		System.out.print("Minutos");
		int dadoMinutos = teclado.nextInt();
		fome.setMinutos(dadoMinutos);

	

		System.out.print(fome.proximaRefeicaoEh());
	}
	

}
