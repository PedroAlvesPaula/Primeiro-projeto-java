package principal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import faculdade.*;
import metodos.*;
import metodosAlteraInformacoes.AlteraInformacoesAluno;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Professor> professores = new ArrayList<Professor>();
		List<Curso> cursos = new ArrayList<Curso>();
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		int valoresMenu = 0;
		
		do {
			valoresMenu = MetodosPrint.escreveOpcoesMenu(input);
		
			switch(valoresMenu) {
				case 0:
					break;
				case 1:
					
					professores.add(MetodosCriaObjetos.geraProfessor(input));
					
					byte verDadosCadastrados = MetodosPrint.printReturnByte("Deseja conferir os dados do professor cadastrado?, digite 1 para sim, 2 para n�o.", input);
				
					if(verDadosCadastrados == 1)
						MetodosPesquisaPofessor.pesquisaProfessorPorNome(professores, input);
					
					break;
				case 2:
					
					cursos.add(MetodosCriaObjetos.criaCurso(input));
			
					byte verCursoCadastrado = MetodosPrint.printReturnByte("Deseja conferir os dados do curso cadastrado? Digite 1 para sim, 2 para n�o.", input);
				
					if(verCursoCadastrado == 1)
						MetodosPesquisaCurso.pesquisaCursoPorNome(cursos, input);
					
					break;
					
				case 3:
					
					Aluno[] alunosVetor = MetodosCriaObjetos.geraAlunos(input, cursos);
				
					for(int i=0; i<alunosVetor.length; i++) {
						if(alunosVetor[i] != null)
							alunos.add(alunosVetor[i]);
						else
							System.out.println("Aluno " + (i+1) + "esta sem informa��es, provavelmente o curso inserido foi inv�lido, cadastre este aluno mais tarde!");
					}
					System.out.println("");
					System.out.println("Aluno(os, as) cadastrado(os, as) com sucesso!");
					
					break;
					
				case 4: 
					
					byte pesquisaAluno = MetodosPrint.printReturnByte("Deseja pesquisar o aluno por qual informa��o? 1 para pesquisa por nome ou 2 para pesquisa por matricula: ", input);
					
					if(pesquisaAluno == 1)
						MetodosPesquisaAluno.pesquisaImprimiAlunoPorNome(alunos, input);
					else if(pesquisaAluno == 2)
						MetodosPesquisaAluno.pesquisaImprimiAlunoPorMatricula(alunos, input);
					else
						System.out.println("N�mero inserido inv�ldo.");
					
					break;
					
				case 5:
					
					byte pesquisaProfessor = MetodosPrint.printReturnByte("Desejesa pesquisar o professor por nome? digite 1 se sim ou 2 se n�o: ", input);
					
					if(pesquisaProfessor == 1)
						MetodosPesquisaPofessor.pesquisaProfessorPorNome(professores, input);
					else if(pesquisaProfessor == 2)
						MetodosPesquisaPofessor.pesquisaProfessorPorCPF(professores, input);
					else
						System.out.println("Op��o inv�lida!");
					break;
					
				case 6:
					
					MetodosPesquisaCurso.pesquisaCursoPorNome(cursos, input);
					break;
					
				case 7:
					
					String matricula = MetodosPrint.printReturnString("Digite a matricua do aluno que deseja cadastrar as notas: ", input);
					
					Aluno aluno = MetodosPesquisaAluno.pesquisaAlunoPorMatricula(alunos, matricula);
					
					double notas[] = MetodosCriaObjetos.pegaNotas(input);
					
					if(MetodosDeValidacao.validaNotas(notas)) {
						aluno.setNota(notas);
					} else {
						System.out.println("Notas não cadastradas, valores inválidos: ");
					}
					break;
					
				case 8:
					
					String matricula1 = MetodosPrint.printReturnString("Digite a matricula do aluno a ser pesquisado, e depois altere a matricula.", input);
					
					Aluno aluno1 = MetodosPesquisaAluno.pesquisaAlunoPorMatricula(alunos, matricula1);
					
					AlteraInformacoesAluno.defaultAlteraMatricula(input, aluno1);
			
				default:
					
					System.out.println("Opção inválida!");
					break;
			}
			valoresMenu = MetodosPrint.printReturnInt("Deseja ver as opções do menu novamente? digite 1 para sim, ou qualquer outra tecla pra não.", input);
		}while(valoresMenu == 1);
		
		System.out.println("Obrigado pela Utilização!!");
	}
}
