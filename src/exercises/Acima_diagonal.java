package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Acima_diagonal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,j,n,soma=0;
		
		System.out.printf("Qual a ordem da matriz? ");
		n=scan.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				soma += matriz[i][j];
			}
		}
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d",soma);
		
	}

}

