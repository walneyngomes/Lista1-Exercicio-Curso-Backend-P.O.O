package Questao17;

import java.util.ArrayList;

public class Professor {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void colocarNota(int bimestre, double nota, int id) {
		buscaAluno(id).addNota(bimestre, nota);
		System.out.print(buscaAluno(id).getNome());
	}

	public Aluno buscaAluno(int id) {
		Aluno aluno = null;
		for (Aluno a : alunos) {
			if (a.getId() == id) {
				aluno = a;
			}
		}
		return aluno;
	}

}
