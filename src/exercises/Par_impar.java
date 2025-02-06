package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n,x,i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=scan.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			x=scan.nextInt();
			if(x % 2 == 0 && x > 0) {
				System.out.println("PAR POSITIVO");
			}else if(x % 2 == 0 && x < 0) {
				System.out.println("PAR NEGATIVO");
			}else if(x % 2 != 0 && x > 0) {
				System.out.println("IMPAR POSITIVO");
			}else if(x % 2 != 0 && x < 0) {
				System.out.println("IMPAR NEGATIVO");
			}else {
				System.out.println("NULO");
			}
		}
		scan.close();
	}
}

