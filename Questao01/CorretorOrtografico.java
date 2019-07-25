package Questao01;

import java.util.ArrayList;

public class CorretorOrtografico {
	private static final int POSSIBILIDADE_Maus_Minus = 2;
	ArrayList<Integer> valores = new ArrayList<Integer>();

	public String buscarPor(String palavra) {

		return null;
	}

	private void addCombinacaoDe(String palavra) {
		int amazena = 0;
		for (int i = 0; i < quantidadePermutacaoDa(palavra); i++) {
			amazena += dividirA(palavra)[i].charAt(0);
		}
		valores.add(amazena);

	}

	private String[] dividirA(String palavra) {
		return palavra.split("");
	}

	private int quantidadePermutacaoDa(String palavra) {

		return potencia(palavra.split(" ").length);

	}

	private int potencia(int valor) {
		return (int) Math.pow(this.POSSIBILIDADE_Maus_Minus, valor);
	}

}
