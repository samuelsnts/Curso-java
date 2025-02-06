package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Pares_consecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int x, soma;
		
		System.out.print("Digite um numero inteiro: ");
		x = scan.nextInt();
		
		while(x != 0) {
			if(x % 2 == 0) {
				soma = x+(x+2)+(x+4)+(x+6)+(x+8);
				System.out.println("SOMA = "+soma);
			}else {
				x++;
				soma = x+(x+2)+(x+4)+(x+6)+(x+8);
				System.out.println("SOMA = "+soma);
			}
			System.out.print("Digite um numero inteiro: ");
			x = scan.nextInt();
		}
		
		scan.close();
	}

}
