package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, x1, x2, delta;
		
		System.out.print("Coeficiente a: ");
		a = scan.nextDouble();
		System.out.print("Coeficiente b: ");
		b = scan.nextDouble();
		System.out.print("Coeficiente c: ");
		c = scan.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		if(delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}else {
			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
		
		scan.close();
	}

}

