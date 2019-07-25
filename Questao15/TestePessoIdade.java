package Questao15;

import java.util.Scanner;

public class TestePessoIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("dia");
		Pessoa pessoa = new Pessoa();
		int dadoUm = teclado.nextInt();
		pessoa.setDia(dadoUm);
		System.out.println("mes");

		int dadoDois = teclado.nextInt();
		System.out.println("ano");
		pessoa.setMes(dadoDois);

		int dadoTres = teclado.nextInt();
		pessoa.setMes(dadoTres);
		System.out.println(pessoa.idadeAtualmenteDaPessoa());

	}

}
