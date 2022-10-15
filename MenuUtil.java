package aulas;

import java.util.Scanner;

public class MenuUtil {
	static Scanner sc = new Scanner(System.in);

	public static void mostrarOpcoesMenu() {
		System.out.println("Escreva uma das opcões(digite um numero)");
		System.out.println("1 - IMC");
		System.out.println("2 - Tabuada");
		System.out.println("3 - Despesas");
		System.out.println("4 - Multas");
		System.out.println("5 - Calcular área de formas");
		System.out.println("6 - Frete");
		System.out.println("7 - Par ou Impar");
		System.out.println("8 - Pedra, Papel ou Tesoura");
		System.out.println("0 - Sair");
	}
	
	public static void main(String[] args) {

		byte opcaoEscolhidaPeloUsuario;
		do {
			mostrarOpcoesMenu();

			opcaoEscolhidaPeloUsuario = sc.nextByte();

			switch (opcaoEscolhidaPeloUsuario) {
			case 1:
				Imc.calcular();
				break;
			case 2:
				Tabuada.calcular();
				break;
			case 3:
				Despesas2.calcular();
				break;
			case 4:
			//	multas();
				break;
			case 5:
				Areas.calcular();
				break;
			case 6:
				Frete.calcular();
				break;
			case 7:
			//	parOuImpar();
				break;
			case 8:
				PedraPapelTesoura.jogo();
				break;
			default:
				System.out.println("Até mais...");
			}
		} while (opcaoEscolhidaPeloUsuario != 0);
		sc.close();
	}

}
