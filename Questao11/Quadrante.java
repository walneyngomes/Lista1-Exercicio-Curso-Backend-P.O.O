package Questao11;

public class Quadrante {
	private int angulo;
	private static final int QADRANTE_UM = 90;
	private static final int QADRANTE_DOIS = 180;
	private static final int QADRANTE_TRES = 270;
	private static final int QADRANTE_QUATRO = 360;

	public String informarQuadrante() {
		String posicao = null;
		if (this.getNumero() < this.QADRANTE_UM) {
			posicao = "Quadrante 1";
		} else if (this.getNumero() > this.QADRANTE_UM && this.getNumero() < this.QADRANTE_DOIS) {
			posicao = "Quadrante 2";
		} else if (this.getNumero() >= this.QADRANTE_DOIS && this.getNumero() < this.QADRANTE_TRES) {
			posicao = "Quadrante 3";
		} else if (this.getNumero() >= this.QADRANTE_TRES && this.getNumero() < this.QADRANTE_QUATRO) {
			posicao = "Quadrante 4";
		}
		return posicao;

	}

	public int getNumero() {
		return angulo;
	}

	public void setNumero(int angulo) {
		this.angulo = angulo;
	}

}
