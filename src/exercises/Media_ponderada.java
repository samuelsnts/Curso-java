package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double n,i,a,b,c,media;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = scan.nextDouble();
		
		for(i=0;i<n;i++) {
			System.out.println("Digite tres numeros:");
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			media = ((2*a)+(3*b)+(5*c)) / 10;
			System.out.println("MEDIA = "+String.format("%.1f", media));
		}
		scan.close();
	}

}

