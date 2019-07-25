package Questao18;

public class ConsumoEnergia {
	private static final int CEM_K = 100;
	private static final int DOZENTOS = 200;
	private static final int QUI = 500;
	private static double[] VALORES_ACRESC = { 0.08, 0.10, 0.12, 0.15 };
	private double valorConsumo;
	private static final double ICMS = 0.18;

	public ConsumoEnergia(double valorConsumo) {
		this.valorConsumo = valorConsumo;

	}

	public double valorPagar() {
		return this.valorConsumo() + this.valorICMS();

	}

	public double valorConsumo() {
		double valor = 0.0;
		if (this.getValorConsumo() <= this.CEM_K) {
			valor = this.VALORES_ACRESC[0] * this.getValorConsumo();
		} else if ((this.getValorConsumo() >= this.CEM_K + 1) && this.DOZENTOS >= this.getValorConsumo()) {
			valor = (this.VALORES_ACRESC[1] * this.getValorConsumo());
		} else if (this.DOZENTOS + 1 > this.getValorConsumo() && this.QUI <= this.getValorConsumo()) {
			valor = (this.VALORES_ACRESC[2] * this.getValorConsumo()) + VALORES_ACRESC[3];

		}
		return valor;
	}

	public double valorICMS() {
		return (this.valorConsumo()* ICMS);

	}

	private double arredondaValor(double valor) {
		double valo=valor = (int) valorICMS();
		if ((valorICMS() - valor) > 0.6 && valorICMS() - valor <= 0.9) {
			valo = valor + 1;
		} else if ((valorICMS() - valor) > 0.3 && (valorICMS() - valor) <= 0.5) {
			valo = valor + 0.5;
		}
		return valo;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public void setValorConsumo(double valorConsumo) {
		this.valorConsumo = valorConsumo;
	}

}
