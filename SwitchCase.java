package aulas;

import java.util.Scanner;

public class SwitchCase {

	// mostrar frete pelo estado
	// am = 35
	// go = 30
	// ba = 50
	// sp = 10
	// rj = 10

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uf = sc.next();
		sc.close();

		switch (uf) {
		case "AM":
			System.out.println("O frete é R$35,00");
			break;
		case "GO":
			System.out.println("O frete é R$30,00");
			break;
		case "BA":
			System.out.println("O frete é R$50,00");
			break;
		case "SP":
		case "RJ":
			System.out.println("O frete é R$10,00");
			break;
		default:
			System.out.println("Não a frete para " + uf);
		}
	}
}

//		if (uf == "AM") {
//			System.out.println("O frete é R$35,00");
//		} else if (uf == "GO") {
//			System.out.println("O frete é R$30,00");
//		} else if (uf == "BA") {
//			System.out.println("O frete é R$50,00");
//		} else if (uf == "SP" || uf == "10,00") {
//			System.out.println("O frete é R$10,00");
//		} else {
//			System.out.println("Não a frete para " + uf);
//		}
//
//	}
