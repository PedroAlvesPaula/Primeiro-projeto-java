package metodosAlteraInformacoes;
import java.util.Scanner;
import exercicios.Data;
import interactions.ConsoleInput;
import metodos.MetodosPrint;

public final class AlteraData {
	
	public static void alteraData(Scanner input, Data data) {
		System.out.println("A data atual é: " + data.getData() + " deseja alterar? se sim digite 1, digite 2 caso contrário: ");
		byte confereMudanca = ConsoleInput.askByte(input);
		
		if (confereMudanca == 1) {
			defaultAlteraData(input, data);
		}
	}
	public static void defaultAlteraData(Scanner input, Data data) {
		String dataNova = MetodosPrint.printReturnString("Data incorreta, entre com outra data de nascimento: ", input);
		
		data.setData(dataNova);
	}
	public static void defaultAlteraDia(Scanner input, Data data) {
		int dia = MetodosPrint.printReturnInt("Entre com o dia correto: ", input);
		
		data.setDia(dia);
		
		defaultAlteraData(input, data);
	}
	public static void defaultAlteraMes(Scanner input, Data data) {
		int mes = MetodosPrint.printReturnInt("Entre com o mês correto: ", input);
		
		data.setMes(mes);
		
		defaultAlteraData(input, data);
	}
	public static void defaultAlteraAno(Scanner input, Data data) {
		System.out.println("Entre com o ano correto: ");
		int ano = MetodosPrint.printReturnInt("Entre com o ano correto: ", input);
		
		data.setAno(ano);
		
		defaultAlteraData(input, data);
	}
}
