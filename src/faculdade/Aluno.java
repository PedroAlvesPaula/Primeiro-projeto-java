package faculdade;
import pessoa.*;

public class Aluno extends Pessoa {
	private String matricula;
	private double nota[] = new double[4];
	private Curso cursoDoAluno;
	
	public Aluno(String matricula, Curso curso, String nome, String cpf, String endereco, String data) {
		super(nome, cpf, endereco, data);
		this.setCursoDoAluno(curso);
		this.setNome(nome);
		this.setMatricula(matricula);
	}
	public Curso getCursoDoAluno() {
		return cursoDoAluno;
	}
	public void setCursoDoAluno(Curso cursoDoAluno) {
		this.cursoDoAluno = cursoDoAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNost() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public double calculaMedia() {
		double sum = 0;
		for(int i=0; i<4; i++) {
			sum = sum + this.nota[i];
		}
		return sum / 4;
	}
	@Override
	public void printDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Endere�o: " + this.getEndereco());
		System.out.println("Data de nascimento: " + this.getData());
	}
	
	
}
