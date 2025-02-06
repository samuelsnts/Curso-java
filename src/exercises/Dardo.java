package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, maior;
		
		System.out.println("Digite as tres distancias: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if(a >= b && a >= c) {
			maior = a;
		}else if(b >= a && b >= c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", maior));
		scan.close();
	}

}

