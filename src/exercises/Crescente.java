package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros:");
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (x != y) {
			if(x > y) {
				System.out.println("Decrescente!");
			}else {
				System.out.println("Crescente!");
			}
			System.out.println("Digite outros dois numeros:");
			x = scan.nextInt();
			y = scan.nextInt();
		}
		scan.close();
	}
}

