package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n, i;

		System.out.print("Quantos valores vai ter cada vetor? ");
		n = scan.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < n; i++) {
			B[i] = scan.nextInt();
		}

		System.out.println("VETOR RESULTANTE:");
		for (i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
		scan.close();
	}

}

