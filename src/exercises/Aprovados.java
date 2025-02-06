package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n;
		
		System.out.print("Quantos alunos serao digitados? ");
		n=scan.nextInt();
		
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
 		String[] nome = new String[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			scan.nextLine();
			nome[i]=scan.nextLine();
			nota1[i]=scan.nextDouble();
			nota2[i]=scan.nextDouble();
		}
 		System.out.println("Alunos aprovados: ");
 
 		for(i=0;i<n;i++) {
 			media[i]=(nota1[i]+nota2[i])/2.0;
 			if(media[i] >= 6.0) {
 				System.out.println(nome[i]);
 			}
 		}
 		scan.close();
	}
}

