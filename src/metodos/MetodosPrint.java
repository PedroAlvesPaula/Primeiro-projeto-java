package metodos;
import java.util.Scanner;
import interactions.ConsoleInput;

public final class MetodosPrint {
	public static String printReturnString(String mensagem, Scanner Input) {
		System.out.println(" ");
		System.out.println(mensagem);
		String res = ConsoleInput.askString(Input);
		return res;
	}
	public static int printReturnInt(String mensagem, Scanner input) {
		System.out.println(" ");
		System.out.println(mensagem);
		int res = ConsoleInput.askInt(input);
		return res;
	}
	public static byte printReturnByte(String mensagem, Scanner input) {
		System.out.println(" ");
		System.out.println(mensagem);
		byte res = ConsoleInput.askByte(input);
		return res;
	}
	public static double printReturnDouble(String mensagem, Scanner input) {
		System.out.println(" ");
		System.out.println(mensagem);
		double res = ConsoleInput.askByte(input);
		return res;
	}
	public static int escreveOpcoesMenu(Scanner input) {
		System.out.println("Digite 1 para cadastrar um professor.");
		System.out.println("Digite 2 para cadastrar um curso.");
		System.out.println("Digite 3 para cadastrar um aluno.");
		System.out.println("Digite 4 para pesquisar um aluno.");
		System.out.println("Digite 5 para pesquisar um professor.");
		System.out.println("Digite 6 para pesquisar sobre um curso.");
		System.out.println("Digite 7 para cadastrar notas de um aluno.");
		System.out.println("Digite 8 para editar ou trocar a matricula de um aluno.");
		System.out.println("Digite 0 se n�o deseja realizar main nenhuma tarefa.");
		int resMenu = ConsoleInput.askInt(input);
		return resMenu;
	}
	static String[] perguntaDadosDoAluno(Scanner input) {
		String[] dadosAluno = new String[5];
		
		dadosAluno[0] = printReturnString("Entre com o nome do aluno: ", input);
		dadosAluno[1] = printReturnString("Entre com a matricula ue o aluno recebera: ", input);
		
		if (MetodosDeValidacao.validaMatriculaAluno(dadosAluno[1]) == false) {
			dadosAluno[1] = printReturnString("Matricula inserida inv�lida, insira a matr�cula novamente: ", input);
		}
		dadosAluno[2] = printReturnString("Entre com o CPF do Aluno: ", input);
		dadosAluno[3] = printReturnString("Entre com o endere�o do aluno: ", input);
		dadosAluno[4] = printReturnString("Informe a data de nascimento do aluno no seguinto formato dia/m�s/ano: ", input);
		
		return dadosAluno;
	}
	static String[] perguntaDadosDoProfessor(Scanner input) {
		String[] dadosAluno = new String[6];
		
		dadosAluno[0] = printReturnString("Entre com o nome do professor: ", input);
		dadosAluno[1] = printReturnString("Entre com o departamento que o professor recebera: ", input);
		dadosAluno[2] = printReturnString("Entre com o email do professor: ", input);
		dadosAluno[3] = printReturnString("Entre com o CPF do professor: ", input);
		dadosAluno[4] = printReturnString("Entre com o endere�o do professor: ", input);
		dadosAluno[5] = printReturnString("Informe a data de nascimento do professor no seguinto formato dia/m�s/ano: ", input);
				
		return dadosAluno;
	}
	public static String[] perguntaDadosDoCurso(Scanner input) {
		
		String[] dados = new String[2];
		dados[0] = printReturnString("Qual ser� o nome do curso? ", input);
		dados[1] = printReturnString("Qual sera o har�rio do curso? ", input);
		
		System.out.println("Confirmar o hor�rio " + dados[1] + ", e o nome " + dados[0] + "? Digite 1 para sim, ou qualuer outro n�mero para n�o.");
		byte confirmando = ConsoleInput.askByte(input);
		
		if(confirmando != 1)
			perguntaDadosDoCurso(input);
		
		return dados;
	}
}
