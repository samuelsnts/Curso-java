package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_geral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,j,n,soma=0;
		
		System.out.printf("Qual a ordem da matriz? ");
		n=sc.nextInt();
		
		double[][] matriz = new double[n][n];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j]=sc.nextInt();
				if(matriz[i][j]>0) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.printf("\nSOMA DOS POSITIVOS: %d\n",soma);
		
		
		

	}

}

