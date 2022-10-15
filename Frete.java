package aulas;

import java.util.Scanner;

public class Frete {

	public static void calcular() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a UF para saber o frete\n AM\n GO\n BA\n SP\n RJ");
		String uf = sc.next();

		switch (uf) {
		case "AM":
			System.out.println("Frete é 35,00");
			break;
		case "GO":
			System.out.println("Frete é 30,00");
			break;
		case "BA":
			System.out.println("Frete é 50,00");
			break;
		case "SP":
		case "RJ":
			System.out.println("Frete é 10,00");
			break;
		default:
			System.out.println("Nao ha frete para " + uf);
		}
		sc.close();
	}

}
