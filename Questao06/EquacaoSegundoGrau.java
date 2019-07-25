package Questao06;

public class EquacaoSegundoGrau {

	private static final int[] CONJUNTO = { 4, 2 };
	private double a;
	private double b;
	private double c;

	public double deltaCalcule() {
		return Math.pow(-b, CONJUNTO[1]) - (CONJUNTO[0] * (this.getA() * this.getC()));
	}

	public String equcaoSistemasFormula() {
		String ax = " " + this.getA() + " X*";
		String bx = " " + this.getB() + " X";
		String cx = " " + this.getA() + "";

		return ax + bx + cx;
	}

	public String x1() {

		String valor = "" + (b + Math.toRadians(this.deltaCalcule())) / CONJUNTO[1] * this.getA() + "";
		if (this.deltaCalcule() < 0) {
			valor = "NAO EXISTE";
		}
		return valor;

	}

	public String x2() {

		String valor = "" + (b + Math.toRadians(this.deltaCalcule())) / CONJUNTO[1] * this.getA() + "";
		if (this.deltaCalcule() < 0) {
			valor = "NAO EXISTE";
		}
		return valor;

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
