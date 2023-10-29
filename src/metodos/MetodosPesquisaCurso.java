package metodos;
import java.util.List;
import java.util.Scanner;
import interactions.*;
import faculdade.*;

public final class MetodosPesquisaCurso {
	
	public static void pesquisaCursoPorNome(List<Curso> cursos, Scanner input) {
		System.out.println("Digite o nome do curso que deseja procurar sem abreviações: ");
		String nomeCurso = ConsoleInput.askString(input);
		
		for(Curso curso : cursos) {
			if(curso.getNome().equals(nomeCurso)) {
				System.out.println("Nome do curso: " + curso.getNome());
				System.out.println("Horário do curso: " + curso.getHorario());
			}
		}
	}
	public static Curso cadastraAlunosNoCurso(Scanner input, List<Curso> cursos) {
		String nomeCursoAluno = MetodosPrint.printReturnString("Em qual curso o aluno será matriculado? ", input);
		
		for(Curso curso : cursos) {
			if(curso.equals(nomeCursoAluno)) 
				return curso;
		}
		return null;
	}
}
