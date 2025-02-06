package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, i, result;

		System.out.print("Deseja a tabuada para qual valor? ");
		x = sc.nextInt();

		for (i = 1; i < 11; i++) {
			result = i * x;
			System.out.println(x + " x " + i + " = " + result);
		}
		sc.close();
	}

}

