package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Diagonal_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,j,qntd_negativos=0;
		
		System.out.print("Qual a ordem da matriz? ");
		n=scan.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j]=scan.nextInt();
				if(matriz[i][j]<0) {
					qntd_negativos++;
				}
			} 
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j) {
					System.out.printf(matriz[i][j]+" ");
				}
			}
		}
		
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d",qntd_negativos);
	}

}
