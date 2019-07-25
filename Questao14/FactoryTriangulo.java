package Questao14;

import java.rmi.MarshalException;

public class FactoryTriangulo {
	public Triangulo criarTrianguloPor(double ladoA, double ladoB, double ladoC) throws ExceptionMeu {
		Triangulo triangulo = null;
		if ((ladoA == ladoB) && (ladoA == ladoC)) {
			triangulo = new Equilatero();
		} else if ((ladoA == ladoB) && (ladoA == ladoC)) {
			triangulo = new Isosceles();
		} else if ((ladoA != ladoB) && (ladoB != ladoC)) {
			triangulo = new Escaleno();
		} else {

			try{
				throw new ExceptionMeu("NENHUM");

			}
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				

			};
		}

		return triangulo;

	}

}
