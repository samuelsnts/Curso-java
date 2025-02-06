package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double precoUni, recebido, troco;
		int qntd;

		System.out.print("Preço unitário do produto: ");
		precoUni = scan.nextDouble();
		System.out.print("Quantidade comprada: ");
		qntd = scan.nextInt();
		System.out.print("Dinheiro recebido: ");
		recebido = scan.nextDouble();

		troco = recebido - (qntd * precoUni);
		System.out.println("TROCO: " + String.format("%.2f", troco));

		scan.close();

	}

}
