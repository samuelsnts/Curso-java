package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n;
		double alt_total=0, media,qntd_abaixo=0,pessoas_menos_16;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n=scan.nextInt();
		
		double[] alt = new double[n];
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			scan.nextLine();
			System.out.print("Nome: ");
			nome[i]=scan.nextLine();
			System.out.print("Idade: ");
			idade[i]=scan.nextInt();
			System.out.print("Altura: ");
			alt[i]=scan.nextDouble();
			if(idade[i]<16) {
				qntd_abaixo++;
			}
			alt_total += alt[i];
		}
		System.out.println();
		media=alt_total/n;
		System.out.println("Altura média: "+String.format("%.2f", media));
		pessoas_menos_16 = (qntd_abaixo/n)*100.0;
		System.out.println("Pessoas com menos de 16 anos: "+String.format("%.1f", pessoas_menos_16)+"%");
		for(i=0;i<n;i++) {
			if(idade[i]<16) {
				System.out.println(nome[i]);
			}
		}
		scan.close();
	}
}

