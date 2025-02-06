package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Negativos_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,j,m;
		
		System.out.printf("Qual a quantidade de linhas da matriz? ");
		n=scan.nextInt();
		System.out.printf("Qual a quantidade de colunas da matriz? ");
		m=scan.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.printf("VALORES NEGATIVOS:\n");
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(matriz[i][j]<0) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		
		scan.close();
		

	}

}

