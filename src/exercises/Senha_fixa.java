package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha:");
		senha = scan.nextInt();
		
		do {
			System.out.print("Senha Invalida! Tente novamente: ");
			senha = scan.nextInt();
		} while (senha != 2002);
		System.out.println("Acesso permitido!");
		scan.close();
	}

}

