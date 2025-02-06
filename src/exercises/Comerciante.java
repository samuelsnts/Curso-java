package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,acima=0,abaixo=0,entre=0;
		double total_compra=0,total_venda=0,lucro_total,percent;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		n=scan.nextInt();
		
		String[] nome = new String[n];
		double[] preco_compra = new double[n];
		double[] preco_venda = new double[n]; 
		
		for(i=0;i<n;i++) {
			System.out.println("Produto "+(i+1)+":");
			scan.nextLine();
			System.out.print("Nome: ");
			nome[i]=scan.nextLine();
			System.out.print("Preco de compra: ");
			preco_compra[i]=scan.nextDouble();
			System.out.print("Preco de venda: ");
			preco_venda[i]=scan.nextDouble();	
			total_compra += preco_compra[i];
			total_venda += preco_venda[i];
		}
		System.out.println();
		System.out.println("RELATORIO:");
		
		lucro_total = total_venda - total_compra;
		for(i=0;i<n;i++) {
			percent = ((preco_venda[i] - preco_compra[i]) / preco_compra[i]*100);

		    if (percent < 10)
		    {
		        abaixo += 1;
		    }else if (percent > 20)
		    {
		        acima += 1;
		    }else{
		        entre += 1;
		    }
		}
	    
	    System.out.println("Lucro abaixo de 10%: "+abaixo);
	    System.out.println("Lucro entre 10% e 20%:  "+entre);
	    System.out.println("Lucro acima de 20%: "+acima);
	    System.out.println("Valor total de compra: "+String.format("%.2f", total_compra));
	    System.out.println("Valor total de venda: "+String.format("%.2f", total_venda));
	    System.out.println("Lucro total: "+String.format("%.2f", lucro_total));
	    scan.close();
	}

}

