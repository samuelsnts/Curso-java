package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double salario, novoSalario, aumento;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = scan.nextDouble();
		
		if(salario <= 1000) {
			aumento = ((20.0/100.0)*salario);
			novoSalario = aumento + salario;
			System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = 20 %");
		}else if(salario > 1000 && salario <= 3000) {
			aumento = ((15.0/100.0)*salario);
			novoSalario = aumento + salario;
			System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = 15 %");
		}else if(salario > 3000 && salario <= 8000) {
			aumento = ((10.0/100.0)*salario);
			novoSalario = aumento + salario;
			System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = 10 %");
		}else {
			aumento = ((5.0/100.0)*salario);
			novoSalario = aumento + salario;
			System.out.println("Novo salario = R$ "+String.format("%.2f", novoSalario));
			System.out.println("Aumento = R$ "+String.format("%.2f", aumento));
			System.out.println("Porcentagem = 5 %");
		}
		scan.close();
	}

}

