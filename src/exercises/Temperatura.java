package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double celsius, faren, conversao;
		char temp;

		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		temp = scan.next().charAt(0);

		if (temp == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			faren = scan.nextDouble();
			conversao = (5 * (faren - 32)) / 9;
			System.out.print("Temperatura equivalente em Celsius: " + String.format("%.2f", conversao));
		} else {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = scan.nextDouble();
			conversao = ((celsius * 9) / 5) + 32;
			System.out.print("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", conversao));
		}
		scan.close();
	}

}
