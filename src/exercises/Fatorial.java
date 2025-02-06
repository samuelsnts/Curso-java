package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i,n,fat=0;
		
		System.out.print("Digite o valor de N: ");
		n = scan.nextInt();
		
		for(i=1;i<=n;i++) {
			if(n == 0) {
				System.out.println("FATORIAL = 1");
			}else {
				fat = 1;
				fat = fat * i;
			}
		}
		System.out.print("FATORIAL = "+fat);
		scan.close();
	}

}

