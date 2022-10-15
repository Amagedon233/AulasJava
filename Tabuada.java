package aulas;

import java.util.Scanner;

public class Tabuada {

	public static void calcular() {

		System.out.println("Digite um número a ser multiplicado");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		System.out.println("Quantas vezes o número será multuplicado?");
		int vezes = scan.nextInt();
		
		for (int i = 0; i <= vezes; i++) {
			System.out.print(numero + " x " + i + " = ");
			System.out.println(numero*i);
			
		scan.close();
		}
	}

}
