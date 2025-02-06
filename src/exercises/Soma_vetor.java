package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int i, n;
		double soma = 0, media;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = scan.nextInt();

		double[] vet = new double[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = scan.nextDouble();
			soma += vet[i];
		}
		System.out.println();
		System.out.print("VALORES = ");
		for (i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		media = soma / n;
		System.out.print("MEDIA = " + String.format("%.2f", media));
		scan.close();
	}
}

