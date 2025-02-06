package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double x, y;

		System.out.print("Valor de X: ");
		x = scan.nextDouble();
		System.out.print("Valor de Y: ");
		y = scan.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x == 0 & y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else {
			System.out.println("Eixo X");
		}
		scan.close();
	}
}

