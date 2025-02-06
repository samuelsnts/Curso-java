package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Cada_linha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,j,maior_elemento=0;;
		
		System.out.printf("Qual a ordem da matriz? ");
		n=scan.nextInt();
		
		int[][] matriz = new int[n][n];

		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		for(i=0;i<n;i++) {
			maior_elemento = matriz[i][0];
			for(j=0;j<n;j++) {
					if(maior_elemento<matriz[i][j]) {
						maior_elemento=matriz[i][j];
					}
				}
			System.out.println(maior_elemento);
			}
		
	}

}

