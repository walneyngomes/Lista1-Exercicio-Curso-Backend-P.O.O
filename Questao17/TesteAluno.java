package Questao17;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Professor professor = new Professor();
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i + 2013);
			professor.addAluno(aluno);

		}
		String dadoProfessor = "OK";

		dadoProfessor = teclado.nextLine();
		System.out.println("MatriculaAluno");

		int alunoId = teclado.nextInt();
		System.out.print("nota1");
		double nota = teclado.nextDouble();
		System.out.print("bimestre");
		System.out.println("Exemple : 20132");
		int bim = teclado.nextInt();
		
		professor.colocarNota(bim, nota, alunoId);

		System.out.print("nota2");
		double nota2 = teclado.nextDouble();
		System.out.print("bimestre");
		System.out.println("Exemple : 20132");
		bim = teclado.nextInt();
		professor.colocarNota(bim, nota2, alunoId);

		System.out.print("nota3");
		double nota3 = teclado.nextDouble();
		System.out.print("bimestre");
		System.out.println("Exemple : 20132");
		bim = teclado.nextInt();
		professor.colocarNota(bim, nota3, alunoId);
		
		



		// TODO Auto-generated method stub
		System.out.println("Matricula Aluno");
		int alunoI = teclado.nextInt();
		System.out.print("Situacao " + professor.buscaAluno(alunoI).situacaoCurso());

	}

}
