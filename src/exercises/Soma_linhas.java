package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Soma_linhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n,m,i,j;
		double soma=0;
		
		System.out.printf("Qual a quantidade de linhas da matriz? ");
		n=scan.nextInt();
		System.out.printf("Qual a quantidade de colunas da matriz? ");
		m=scan.nextInt();
		
		double[][] x = new double[n][m];
		double[] vetor_gerado = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.printf("Digite os elementos da %da. linha:\n",i+1);
			for(j=0;j<m;j++) {
				x[i][j]=scan.nextDouble();
			}
		}
		System.out.print("VETOR GERADO:\n");
		for(i=0;i<n;i++) {
			soma=0;
			for(j=0;j<m;j++) {
				soma += x[i][j];
			}
			vetor_gerado[i] = soma;
			System.out.print(vetor_gerado[i]+"\n");
		}
	}

}

