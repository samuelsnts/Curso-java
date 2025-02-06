package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double media, soma = 0, x = 0, cont = 0;

		System.out.println("Digite as idades:");
		x = scan.nextDouble();

		if (x < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (x >= 0) {
				cont++;
				soma += x;
				x = scan.nextDouble();
			}
			media = soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		scan.close();
	}
}
