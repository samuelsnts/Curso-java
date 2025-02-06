package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double x,i,den,num,result;
		
		System.out.print("Quantos casos voce vai digitar? ");
		x = scan.nextDouble();
		
		for(i=0;i<x;i++) {
			System.out.print("Entre com o numerador: ");
			num = scan.nextDouble();
			System.out.print("Entre com o denominador: ");
			den = scan.nextDouble();
			if(den == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}else {
				result = num/den;
				System.out.println("DIVISAO = "+String.format("%.2f", result));
			}
		}
		scan.close();
	}

}

