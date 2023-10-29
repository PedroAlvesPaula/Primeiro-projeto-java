package metodos;
import java.util.List;
import java.util.Scanner;
import faculdade.*;
import metodosAlteraInformacoes.AlteraData;
import metodosAlteraInformacoes.AlteraInformacoesAluno;

public class MetodosCriaObjetos {
	
	public static Professor geraProfessor(Scanner input) {
		String[] dadosProfessor = MetodosPrint.perguntaDadosDoProfessor(input);
		
		Professor professor = new Professor(dadosProfessor[0], dadosProfessor[1], dadosProfessor[2],dadosProfessor[3],dadosProfessor[4], dadosProfessor[5]);

		return professor;
	}
	public static Aluno[] geraAlunos(Scanner input, List<Curso> cursos) {
		int num = MetodosPrint.printReturnInt("Quantos alunos deseja cadastrar? ", input);
		
		Aluno[] alunos = new Aluno[num];
		
		for(int i=0; i < num; i++) {
			
			Curso curso = MetodosPesquisaCurso.cadastraAlunosNoCurso(input, cursos);
			String[] dadosAluno = MetodosPrint.perguntaDadosDoAluno(input);
			
			if(curso.getNome() != null) {
				alunos[i] = new Aluno(dadosAluno[1], curso, dadosAluno[0], dadosAluno[2], dadosAluno[3], dadosAluno[4]);
			 
				if(MetodosDeValidacao.validaMatriculaAluno(alunos[i].getMatricula()) == false) 
					AlteraInformacoesAluno.defaultAlteraMatricula(input, alunos[i]);
				if(MetodosDeValidacao.verificaData(input, alunos[i]) == false)
					AlteraData.defaultAlteraData(input, alunos[i].getDataObject());
			}
			else 
				System.out.println("Aluno(os, as) não cadastrado(s), curso inexistente!");
		}
		return alunos;
	}
	public static double[] pegaNotas(Scanner input) {
		double notas[] = new double[4];
		
		for(int i=0; i<4; i++) {
			notas[i] = MetodosPrint.printReturnDouble("Entre com a nota do aluno " + (i+1), input);
		}
		return notas;
	}
	public static Curso criaCurso(Scanner input) {
		String[] dadosDoCurso = MetodosPrint.perguntaDadosDoCurso(input);
	
		Curso curso = new Curso(dadosDoCurso[0], dadosDoCurso[1]);
		
		return curso;
	}
}
