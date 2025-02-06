package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Dentro_fora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n,x,i,dentro=0,fora=0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=scan.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			x=scan.nextInt();
			if(x >= 10 && x <= 20) {
				dentro++;
			}else {
				fora++;
			}
		}
		
		System.out.println(dentro+" DENTRO");
		System.out.println(fora+" FORA");
		scan.close();
	}

}

