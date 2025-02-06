package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		char tipos;
		int qntd_cobaias,i,n,total_cobaias=0,total_c=0,total_r=0,total_s=0;
		double percent_c,percent_r,percent_s;
		
		System.out.print("Quantos casos de teste serao digitados?");
		n = scan.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.print("Quantidade de cobaias: ");
			qntd_cobaias = scan.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipos = scan.next().charAt(0);
			total_cobaias += qntd_cobaias;
			
			if(tipos == 'C') {
				total_c += qntd_cobaias;
			}else if(tipos == 'S') {
				total_s += qntd_cobaias;
			}else {
				total_r += qntd_cobaias;
			}
		}
		percent_c =( (double)total_c/total_cobaias)*100.0;
		percent_r = ((double)total_r/total_cobaias)*100.0;
		percent_s = ((double)total_s/total_cobaias)*100.0;
		
		System.out.println();
		System.out.println("RELATORIO FINAL: ");
		System.out.println("Total: "+total_cobaias+" cobaias");
		System.out.println("Total de coelhos: "+total_c);
		System.out.println("Total de ratos: "+total_r);
		System.out.println("Total de sapos: "+total_s);
		System.out.println("Percentual de coelhos: "+String.format("%.2f", percent_c));
		System.out.println("Percentual de ratos: "+String.format("%.2f", percent_r));
		System.out.println("Percentual de sapos: "+String.format("%.2f", percent_s));
		scan.close();
	}

}

