package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n,posicao=0;
		
		System.out.print("Quanto numeros voce vai digitar? ");
		n=sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i]=sc.nextDouble();
		}
		System.out.println();
		
		for(i=0;i<n;i++) {
			if(vet[0]<vet[i]) {
				vet[0]=vet[i];
				posicao=i;
			}
		}
		System.out.println("MAIOR VALOR = "+String.format("%.1f", vet[0]));
		System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
		sc.close();
	}

}
