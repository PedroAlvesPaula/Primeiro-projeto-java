package pessoa;

import exercicios.Data;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	private Data data;
		
	public Pessoa(String nome, String cpf, String endereco, String data){
		this.setCpf(cpf);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setData(data);
	}
	public Data getDataObject() {
		return data;
	}
	public String getData() {
		return data.getData();
	}
	public void setData(String data) {
		this.data = new Data(data);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public abstract void printDados();
}
