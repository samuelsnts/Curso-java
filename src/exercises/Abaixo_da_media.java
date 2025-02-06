package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n;
		double media,soma=0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n=scan.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i]=scan.nextDouble();
			soma += vet[i];
		}
		System.out.println();
		media = soma/n;
		System.out.println("MEDIA DO VETOR = "+String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(i=0;i<n;i++) {
			if(vet[i]<media) {
				System.out.println(String.format("%.1f", vet[i]));
			}
		}
		scan.close();
	}

}
