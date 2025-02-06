package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Troco_verificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double preco, qntd, recebido, troco, falta;
		
		System.out.print("Preço unitário do produto: ");
		preco = scan.nextDouble();
		System.out.print("Quantidade comprada: ");
		qntd = scan.nextDouble();
		System.out.print("Dinheiro recebido: ");
		recebido = scan.nextDouble();
		
		troco = recebido - (preco * qntd);
		
		if(recebido > (preco * qntd)) {
			System.out.println("TROCO = " + String.format("%.2f", troco));
		}else {
			falta = (preco * qntd) - recebido;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", falta) +" REAIS");
		}
		scan.close();
	}

}

