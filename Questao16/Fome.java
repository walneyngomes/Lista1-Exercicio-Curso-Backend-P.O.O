package Questao16;

public class Fome {
	private static final String CAFE = "06:00";
	private static final String ALMOCO = "12:30";
	private static final String JANTAR = "18:30";
	private static final int LIMIT_MINUT = 59;
	private int hora;
	private int minutos;

	public String proximaRefeicaoEh() {

		String horaDe = "Comer Karitó";
		if (verificaAlmoco()) {
			horaDe = "Almoço ";

		} else if (verificaJantar()) {

			horaDe = "Jantar ";

		} else if (verificaCafe() || !verificaJantar()) {
			horaDe = "Cafe com pamonha ";
		}

		return horaDe;
	}

	private boolean verificaCafe() {
		return this.verificaMinuto(this.CAFE) >= this.getMinutos() && this.verificarHora(this.ALMOCO) >= this.getHora();
	}

	private boolean verificaAlmoco() {
		return this.verificaMinuto(this.ALMOCO) >= this.getMinutos()
				&& this.verificarHora(this.ALMOCO) >= this.getHora();

	}

	private boolean verificaJantar() {
		return this.verificaMinuto(this.JANTAR) <= this.getMinutos()
				&& this.verificarHora(this.ALMOCO) <= this.getHora();
	}

	public int verificarHora(String refeicaoHorario) {

		return Integer.parseInt(refeicaoHorario.split("")[0] + "" + refeicaoHorario.split("")[1]);
	}

	public int verificaMinuto(String refeicaoHorario) {
		return Integer.parseInt(refeicaoHorario.split("")[3] + "" + refeicaoHorario.split("")[4]);

	}

	private String tratadorHoraMinutos() {
		String[] hora = Integer.toString(this.getHora()).split("");
		String[] minutos = hora = Integer.toString(this.getMinutos()).split("");
		String marcacao = "";
		if (hora[0] == "0" && minutos[0] == "0") {
			marcacao = hora[1] + ":" + minutos[1];
		} else if (hora[0] == "0") {
			marcacao = hora[1] + ":" + this.getMinutos();

		} else if (minutos[0] == "0") {
			marcacao = this.getHora() + ":" + this.getMinutos();

		}
		return marcacao;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

}
