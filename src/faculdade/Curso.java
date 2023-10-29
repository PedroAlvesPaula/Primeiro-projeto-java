package faculdade;

import java.util.Objects;

public class Curso {
	private String nome;
	private String horario;
	
	public Curso(String nome, String horario) {
		super();
		this.setNome(nome);
		this.setHorario(horario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	@Override
	public boolean equals(Object obj) {
		return this.nome.equals(obj);
	}
}
