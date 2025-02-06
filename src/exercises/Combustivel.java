package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int gasolina=0, alcool=0, diesel=0, cod;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		cod = scan.nextInt();
		
		while(cod != 4) {
			if(cod == 1) {
				alcool++;
			}else if(cod == 2) {
				gasolina++;
			}else if(cod == 3) {
				diesel++;
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			cod = scan.nextInt();
		}
		System.out.println("MUITO OBRIGADO ");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		scan.close();
	}

}

