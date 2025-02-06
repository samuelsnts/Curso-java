package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double distancia, combustivelGasto,  consumo; 

		System.out.print("Distancia percorrida: ");
		distancia = scan.nextDouble();
		System.out.print("Combustível gasto: ");
		combustivelGasto = scan.nextDouble();

		consumo = (1000 / combustivelGasto) * distancia;
		System.out.println("Consumo medio = " + String.format("%.0f", consumo));

		scan.close();

	}

}

