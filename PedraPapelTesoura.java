package aulas;

import java.util.Scanner;

import java.util.Random;

public class PedraPapelTesoura {
	public static void jogo() {
		Scanner sc = new Scanner(System.in);
		int escolha;
		do {
			System.out.println("Escolha entre: Pedra, Papel ou Tesoura");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("4 - Sair");

			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				Random random = new Random();
				int numeroAle = random.nextInt(3);

				System.out.println(numeroAle);

				switch (numeroAle) {
				// pedra = 0
				case 0:
					System.out.println("Adversário escolheu Pedra: Empate");
					break;
				case 1:
					System.out.println("Adversário escolheu Tesoura: Vitória");
					break;
				case 2:
					System.out.println("Adversário escolheu Papel: Derrota");
					break;
				}
				break;

			case 2:
				random = new Random();
				numeroAle = random.nextInt(3);

				System.out.println(numeroAle);

				switch (numeroAle) {
				// papel = 1
				case 0:
					System.out.println("Adversário escolheu Pedra: Vitória");
					break;
				case 1:
					System.out.println("Adversário escolheu Tesoura: Derrota");
					break;
				case 2:
					System.out.println("Adversário escolheu Papel: Empate");
					break;
				}
				break;

			case 3:
				random = new Random();
				numeroAle = random.nextInt(3);

				System.out.println(numeroAle);

				switch (numeroAle) {
				// tesoura = 2
				case 0:
					System.out.println("Adversário escolheu Pedra: Derrota");
					break;
				case 1:
					System.out.println("Adversário escolheu Tesoura: Empate");
					break;
				case 2:
					System.out.println("Adversário escolheu Papel: Vitória");
					break;
				}
				break;
			}

		} while (escolha != 4);
		sc.close();
	}
}