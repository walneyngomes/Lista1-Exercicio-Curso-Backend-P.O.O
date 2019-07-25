package Questao13;

public class Triangulo {
	private static final int NUM_LADOS = 3;
	private double[] lados = new double[NUM_LADOS];

	public String verificaTriagulo() {
		String status = "Nao";
		if ((this.getLados()[0] == this.getLados()[1]) && this.getLados()[2] == this.getLados()[2]) {
			status = "Sim";
		}
		return status;
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}

}
