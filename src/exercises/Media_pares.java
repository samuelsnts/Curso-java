package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int i, n, qntd = 0, soma = 0;
		double media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = scan.nextInt();

		int[] vet = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = scan.nextInt();
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				qntd++;
			}
		}
		media = soma / qntd;
		if (media <= 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
		scan.close();
	}

}
