package metodosAlteraInformacoes;
import java.util.Scanner;
import faculdade.Aluno;
import metodos.MetodosDeValidacao;
import metodos.MetodosPrint;

public class AlteraInformacoesAluno {
	
	public static void defaultAlteraMatricula(Scanner input, Aluno aluno) {
		String matricula = MetodosPrint.printReturnString("Entre com a matricula correta (ex: 22.2.8300): ", input);
		
		if(MetodosDeValidacao.validaMatriculaAluno(matricula))
			aluno.setMatricula(matricula);
		else
			defaultAlteraMatricula(input, aluno);
	}
	public static void defaultAlteraNomeAluno(Scanner input, Aluno aluno) {
		String nome = MetodosPrint.printReturnString("Entre com o nome completo do aluno: ", input);
		
		if(nome != "" && nome != null)
			aluno.setNome(nome);
		else
			defaultAlteraNomeAluno(input, aluno);
	}
}
