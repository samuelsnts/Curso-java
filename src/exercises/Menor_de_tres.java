package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a, b, c, menor;

		System.out.print("Primeiro valor: ");
		a = scan.nextInt();
		System.out.print("Segundo valor: ");
		b = scan.nextInt();
		System.out.print("Terceiro valor: ");
		c = scan.nextInt();

		if (a < b && a < c) {
			menor = a;
		} else if (b < a && b < c) {
			menor = b;
		} else {
			menor = c;
		}

		System.out.println("MENOR = " + menor);
		scan.close();
	}

}
