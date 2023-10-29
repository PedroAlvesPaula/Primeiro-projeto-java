package exercicios;

public class Data {
	private String data;
	private int ano;
	private int mes;
	private int dia;
	
	public Data(String data) {
		this.setData(data);
	}
	public String getData() {
		return data;
	}
	public void setData(String dataDeNascimento) {
			this.data = dataDeNascimento;
			this.separaData(dataDeNascimento);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
			this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
			this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
			this.dia = dia;
	}
	private void separaData(String data){
		String dataSeparada[] = data.split("\\/");
		
		int datas[] = new int[3];
		
		for(int i=0; i<datas.length; i++ ) {
			datas[i] = Integer.parseInt(dataSeparada[i]);
		}
	    this.setDia(datas[0]);
	    this.setMes(datas[1]);
	    this.setAno(datas[2]);
	}
	
}
