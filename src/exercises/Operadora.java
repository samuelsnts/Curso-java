package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int min;
		double valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		min = scan.nextInt();
		
		if(min > 100) {
			valor = (min - 100) * 2.0 + 50.0;
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		}else {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		scan.close();
	}

}

