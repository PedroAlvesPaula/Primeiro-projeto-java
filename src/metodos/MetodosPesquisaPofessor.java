package metodos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import faculdade.*;

public final class MetodosPesquisaPofessor {
	
	public static void pesquisaProfessorPorNome(List<Professor> professores, Scanner input) {
		
		String nomeProfessor = MetodosPrint.printReturnString("Qual o nome completo do professor que voc� deseja pesquisar? ", input);
		
		byte saberSeProfessorFoiEncontrado = 0;
		
		for (Professor professor : professores) {
			if(professor.getNome().equals(nomeProfessor)) {
				
				professor.printDados();
				
				saberSeProfessorFoiEncontrado++;
			}
		}
		if(saberSeProfessorFoiEncontrado == 0) {
			System.out.println("Professor n�o encontrado!");
		}
	}
	public static void pesquisaProfessorPorCPF(List<Professor> professores, Scanner input) {
		
		String cpfProfessor = MetodosPrint.printReturnString("Digite o CPF do professor, com pontos e tra�os (ex: 111.222.333-45", input);
		
		byte saberSeProfessorFoiEncontrado = 0;
		
		for(Professor professor : professores) {
			if(professor.getCpf().equals(cpfProfessor)) {
				professor.printDados();
				saberSeProfessorFoiEncontrado++;
			}
		}
		if(saberSeProfessorFoiEncontrado == 0)
			System.out.println("Professor nao encontrado!");
	}
}
