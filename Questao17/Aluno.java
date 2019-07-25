package Questao17;

public class Aluno {
	private int id;
	private String nome = "Walney Negreiros Gomes";
	private static final int BIM = 3;
	private double[] notas = new double[BIM];

	private static final int MEDIA = 6;

	public void addNota(int bimestre, double nota) {
		notas[bimestre - 1] = nota;
	}

	public String situacaoCurso() {
		double nota = 0.0;
		String status = "reprovado";
		for (int i = 0; i < notas.length; i++) {
			nota += notas[i];
		}
		if (media(nota) >= this.MEDIA) {
			status = "Aprovado";
		}
		return status + "" + "MEDIA ATUAL " + media(nota);
	}

	private double media(double valores) {
		return valores / this.notas.length;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
