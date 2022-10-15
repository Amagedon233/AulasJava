package aulas;

import java.util.Scanner;

public class Imc {

	public static void calcular() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazendo IMC");
		double massa;
		double altura;
		double IMC;

		System.out.println("Digite sua massa:");
		massa = sc.nextDouble();
		System.out.println("Digite sua altura:");
		altura = sc.nextDouble();
		IMC = massa / (altura * 2);
		System.out.println("Seu IMC é: " + IMC);

		System.out.println("O seu IMC é " + IMC + ".");

		if (IMC < 18.5) {
			System.out.println("Seu indice é: Magreza");
		} else if (IMC >= 18.5 && IMC < 24.9) {
			System.out.println("Seu indice é: Normal");
		} else if (IMC >= 24.9 && IMC < 30) {
			System.out.println("Seu indice é: Sobrepeso");
		} else {
			System.out.println("Seu indice é: Obesidade");
		}
		
		sc.close();
	}

}
