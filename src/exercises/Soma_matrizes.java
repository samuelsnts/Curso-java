package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Soma_matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,j,n,m;
		
		System.out.printf("Quantas linhas vai ter cada matriz? ");
		n=scan.nextInt();
		System.out.printf("Quantas colunas vai ter cada matriz? ");
		m=scan.nextInt();
		
		int[][] matriz_a = new int[n][m];
		int[][] matriz_b = new int[n][m];
		int[][] matriz_c = new int[n][m];
		
		System.out.println("Digite os valores da matriz A:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz_a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz_b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				matriz_c[i][j] = matriz_a[i][j] + matriz_b[i][j];
				System.out.printf("%d ", matriz_c[i][j]);
			}
			System.out.println();
		}

	}

}

