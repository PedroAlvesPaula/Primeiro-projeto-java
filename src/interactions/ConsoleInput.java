package interactions;

import java.util.Scanner;

public final class ConsoleInput {
	public static int askInt(Scanner scanner) {
		int res = scanner.nextInt();
		clearBuffer(scanner);
		return res;
	}
	public static double askDouble( Scanner scanner ) {
		double res = scanner.nextDouble();
		clearBuffer(scanner);
		return res;
	}
	public static String askString( Scanner scanner ) {
		String res = scanner.nextLine();
		return res;
	}
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	public static byte askByte(Scanner scanner) {
		byte res = scanner.nextByte();
		clearBuffer(scanner);
		return res;
	}
}
