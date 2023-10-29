package metodos;

import java.util.Scanner;

import faculdade.Aluno;

public class MetodosDeValidacao {
	public static boolean validaMatriculaAluno(String matricula) {
		if(matricula == "" || matricula == null) 
			return false;
			
		String var[] = matricula.split("\\.");
		
		if(var.length != 3)
			return false;
		
		int ano = Integer.parseInt(var[0]);
		int semestre = Integer.parseInt(var[1]);
		int numMatricula = Integer.parseInt(var[2]);
				
		if( ano > 23 || ano < 04 || semestre <= 0 || semestre >= 3|| numMatricula < 8000 || numMatricula >= 9000)
			return false;
		
		return true;
	}
	public static boolean validaData(String data) {
		if(data == "" || data == null )
			return false;
		return true;
	}
	public static boolean validaDia(int dia){
		if( dia < 1 || dia > 31)
			return false;
		return true;
	}
	public static boolean validaMes(int mes) {
		if (mes < 1 || mes > 12)
			return false;
		return true;
	}
	public static boolean validaAno(int ano) {
		if (ano > 2023 || ano < 1970)
			return false;
		return true;
	}
	public static boolean verificaData(Scanner input, Aluno alunos) {
		if(MetodosDeValidacao.validaData(alunos.getDataObject().getData()) == false)
			return false;
		if(MetodosDeValidacao.validaAno(alunos.getDataObject().getAno()) == false)
			return false;
		if(MetodosDeValidacao.validaMes(alunos.getDataObject().getMes()) == false)
			return false;
		if(MetodosDeValidacao.validaDia(alunos.getDataObject().getDia()) == false)
			return false;
	return true;
	}
	public static boolean validaNotas(double notas[]) {
		for(double nota : notas) {
			if(nota == 0.0 || nota > 10.0 || nota < 0.0 ) {
				return false;
			}
		}
		return true;
	}
}
