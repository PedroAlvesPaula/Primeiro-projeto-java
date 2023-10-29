package faculdade;
import exercicios.Data;
import pessoa.*;

public class Professor extends  Pessoa {
	
	private String departamento;
	private String email;
	
	public Professor(String nome, String departamento, String email, String cpf, String endereco, String dataDeNascimento) {
		super(nome, cpf, endereco, dataDeNascimento);
		this.setNome(nome);
		this.setDepartamento(departamento);
		this.setEmail(email);
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public void printDados() {
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Data de nascimento: " + this.getData());
	}
	
}
