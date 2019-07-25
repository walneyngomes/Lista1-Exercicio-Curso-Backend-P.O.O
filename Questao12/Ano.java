package Questao12;

public class Ano {
	private int ano;

	public boolean isBissexto() {
		boolean esBissexto = false;
		if (this.getAno() % 400 == 0) {
			esBissexto = true;
			// se o ano for menor que 400
		} else if ((this.getAno() % 4 == 0) && (this.getAno() % 100 != 0)) {
			esBissexto = false;
			;
		} else {
			esBissexto = false;
		}

		return esBissexto;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}