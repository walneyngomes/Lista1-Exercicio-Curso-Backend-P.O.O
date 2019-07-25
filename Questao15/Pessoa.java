package Questao15;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	private static final int MM = 0;
	private int id;
	private String nome;
	Calendar cal;
	
	private int dia;
	private int mes;
	private int ano;

	public Pessoa() {

		this.cal = new GregorianCalendar();
	
	}

	public int idadeAtualmenteDaPessoa() {
		int idade;
		if (verificadorAniversario()) {
			idade = this.calculaIdade();
		} else {
			idade =calculaIdade() ;
		}
		return idade;

	}

	private int calculaIdade() {
		return this.cal.YEAR - this.getAno();
	}

	private boolean verificadorAniversario() {
		return this.cal.DAY_OF_MONTH >= this.getDia() && this.cal.MONTH >= this.getMes()
				&& this.getAno() == this.cal.YEAR;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
