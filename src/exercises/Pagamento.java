package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String nome;
		double valorHora, horasTrab, pagamento;

		System.out.print("Nome: ");
		nome = scan.nextLine();
		System.out.print("Valor por hora: ");
		valorHora = scan.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrab = scan.nextDouble();

		pagamento = valorHora * horasTrab;
		System.out.print("O pagamento para " +nome+  " deve ser " + String.format("%.2f", pagamento));

		scan.close();

	}

}

