package aulas;

import java.util.Scanner;

public class Despesas {

	public static void calcular() {

		System.out.println("Digite sua renda");
		System.out.println("(Apenas numeros e virgula para decimais)");

		Scanner renda = new Scanner(System.in);
		double rendaMes = renda.nextDouble();

		int quantidadeDespesas = 3;
		double tudoEmDinheiro = 300.20;
		double tudoEmCartao = 123.23;

		double totalDespesas = tudoEmCartao + tudoEmDinheiro;
		System.out.println(totalDespesas);
		System.out.println(quantidadeDespesas);
		if (totalDespesas > rendaMes) {
			System.out.println("Pegar dinheiro com agiota");
		} else {
			System.out.println("Deu bom");
		}
		
		renda.close();
	}
}
