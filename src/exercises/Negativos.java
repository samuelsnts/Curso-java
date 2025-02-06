package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=scan.nextInt();
		
		int[] x = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			x[i]=scan.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(i=0;i<n;i++) {
			if(x[i]<0) {
				System.out.println(x[i]);
			}
		}
		scan.close();
	}

}

