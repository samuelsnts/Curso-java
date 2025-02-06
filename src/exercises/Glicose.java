package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = scan.nextDouble();
		
		if(glicose <= 100) {
			System.out.println("Classificacao: normal");
		}else if(glicose > 100 && glicose <= 140) {
			System.out.println("Classificacao: elevado");
		}else {
			System.out.println("Classificacao: diabetes");
		}
		scan.close();
	}

}

