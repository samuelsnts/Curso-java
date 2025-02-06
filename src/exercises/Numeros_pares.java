package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int i, n, qntd = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = scan.nextInt();

		int[] x = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS PARES:");

		for (i = 0; i < n; i++) {
			if (x[i] % 2 == 0) {
				System.out.print(x[i] + "  ");
				qntd++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qntd);
		scan.close();
	}

}

