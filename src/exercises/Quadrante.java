package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x, y;

		System.out.println("Digite os valores das coordenadas X e Y: ");
		x = scan.nextInt();
		y = scan.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			} else if (x > 0 && y < 0) {
				System.out.println("QUADRANTE Q4");
			}
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = scan.nextInt();
			y = scan.nextInt();
		}
		scan.close();
	}

}

