package metodos;
import java.util.List;
import java.util.Scanner;
import faculdade.Aluno;
import interactions.ConsoleInput;

public class MetodosPesquisaAluno {
	public static Aluno pesquisaAlunoPorMatricula(List<Aluno> alunos, String matricula) {
		Aluno alunoCerto = null;
		for(Aluno aluno : alunos) {
			if(aluno.getMatricula().equals(matricula)) {
				alunoCerto = aluno;
			}
			else {
				System.out.println("Aluno não encontrado!");
				break;
			}
		}
		return alunoCerto;
	}
	public static void pesquisaImprimiAlunoPorNome(List<Aluno> alunos, Scanner input) {
		System.out.println("Digite o nome completo do aluno: ");
		String nomeAluno = ConsoleInput.askString(input);
		
		for(Aluno aluno : alunos) {
			if(aluno.getNome().equals(nomeAluno)) {
				aluno.printDados();
				
				double notas[] = aluno.getNost();
				
				for(int i=0; i<4; i++) {
					System.out.println("Nota " + (i+1) + ":" + notas[i]);
				}
				System.out.println("A media do aluno " + nomeAluno + " é: " + aluno.calculaMedia());
			}
		}
	}
	public static void pesquisaImprimiAlunoPorMatricula(List<Aluno> alunos, Scanner input) {
		String matricula = MetodosPrint.printReturnString("Digite a matricula do aluno a pesquisar: ", input);
		
		Aluno aluno = pesquisaAlunoPorMatricula(alunos, matricula);
		
		aluno.printDados();
		
		double notas[] = aluno.getNost();
		
		for(int i=0; i<4; i++) {
			System.out.println("Nota " + (i+1) + ":" + notas[i]);
		}
		System.out.println("A media do aluno " + matricula + " é: " + aluno.calculaMedia());
	}

}
