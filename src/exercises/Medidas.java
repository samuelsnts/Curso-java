package exercises;

import java.util.Scanner;
import java.util.Locale;

public class Medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double a, b, c, areaQuad, areaTri, areaTrap;

		System.out.print("Digite a medida A: ");
		a = scan.nextDouble();
		System.out.print("Digite a medida B: ");
		b = scan.nextDouble();
		System.out.print("Digite a medida C: ");
		c = scan.nextDouble();

		areaQuad = Math.pow(a,2);
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f",areaQuad));
		areaTri = (a * b) / 2;
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f",areaTri)); 
		areaTrap = ((a + b) * c) / 2;
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f",areaTrap));

		scan.close();

	}

}

