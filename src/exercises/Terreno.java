package exercises;

import java.util.Scanner;
import java.util.Locale;

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, alt, area, perim, diag;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		alt = sc.nextDouble();
		
		area = (base * alt);
		perim = (base * 2) + (alt * 2);
		diag = Math.sqrt(Math.pow(base, 2) + Math.pow(alt, 2));
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f",perim));
		System.out.println("DIAGONAL = " + String.format("%.4f", diag));
		
		sc.close();
	}

}

