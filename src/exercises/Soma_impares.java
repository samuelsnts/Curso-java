package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,x, y,soma=0, troca;
		
		System.out.println("Digite dois numeros:");
		x=scan.nextInt();
		y=scan.nextInt();
		
		if(x>y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		for(i=x+1;i<y;i++) {
			if(i%2 != 0) {
				soma += i;
			}
		}
		System.out.println("SOMA DOS IMPARES = "+soma);
		scan.close();
	}

}

