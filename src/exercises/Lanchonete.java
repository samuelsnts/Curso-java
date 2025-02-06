package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double cod, valor, qntd;
		
		System.out.print("Codigo do produto comprado: ");
		cod = scan.nextDouble();
		System.out.print("Quantidade comprada: ");
		qntd = scan.nextDouble();
		
		if(cod == 1) {
			valor = qntd * 5.00;
		}else if(cod == 2) {
			valor = qntd * 3.50;
		}else if(cod == 3) {
			valor = qntd * 4.80;
		}else if(cod == 4) {
			valor = qntd * 8.90;
		}else {
			valor = qntd * 7.32;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		
		
		scan.close();

	}

}

