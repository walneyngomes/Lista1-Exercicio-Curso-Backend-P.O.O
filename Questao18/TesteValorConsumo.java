package Questao18;

import java.util.Scanner;

public class TesteValorConsumo {

	public static void main(String[] args) {
		ConsumoEnergia consumo;
		Scanner teclado = new Scanner(System.in);
		double valorConsumoDado = teclado.nextDouble();
		consumo = new ConsumoEnergia(valorConsumoDado);
		System.out.println("Valor Consumo=" + consumo.valorConsumo());
		System.out.println("Valor ICMS=" + consumo.valorICMS());
		System.out.println("Valor Pagar=" + consumo.valorPagar());
		teclado.close();
		
		
		

	}

}
