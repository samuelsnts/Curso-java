package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Sequencia_impares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x, i;

		System.out.print("Digite o valor de X: ");
		x = scan.nextInt();

		for (i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}

