package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,contador_homens=0,contador_mulher=0;
		double soma=0,media;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n=scan.nextInt();
		
		char[] genero = new char[n];
		double[] altura = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			altura[i]=scan.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			genero[i]=scan.next().charAt(0);
			
			if(genero[i] == 'F') {
				soma += altura[i];
				contador_mulher++;
			}else {
				contador_homens++;
			}
		}
		media=soma/contador_mulher;
		double menor_alt=altura[0],maior_alt=altura[0];
		
		for(i=0;i<n;i++) {
			if(menor_alt>altura[i]) {
				menor_alt=altura[i];
			}
			
			if(maior_alt<altura[i]) {
				maior_alt=altura[i];
			}
		}
	
		System.out.println("Menor altura = "+String.format("%.2f", menor_alt));
		System.out.println("Maior altura = "+String.format("%.2f", maior_alt));
		System.out.println("Media das alturas das mulheres = "+String.format("%.2f", media));
		System.out.println("Numero de homens = "+contador_homens);
		scan.close();
	}

}

