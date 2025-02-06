package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, n, pessoa_mais_velha = 0, posicao = 0;

		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();

		int[] idade = new int[n];
		String[] nome = new String[n];

		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			if (pessoa_mais_velha < idade[i]) {
				pessoa_mais_velha = idade[i];
				posicao = i;
			}
		}

		System.out.print("PESSOA MAIS VELHA: " + nome[posicao]);
		sc.close();
	}

}
