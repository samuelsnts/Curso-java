package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a, b, troca;

		System.out.println("Digite dois numeros inteiros:");
		a = scan.nextInt();
		b = scan.nextInt();

		if (a < b) {
			troca = a;
			a = b;
			b = troca;
		}

		if (a % b == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		scan.close();
	}

}

