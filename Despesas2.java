package aulas;

import java.util.Scanner;

public class Despesas2 {

	public static void calcular() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua renda mensal");
		double rendaMes = sc.nextDouble();
		System.out.println("Digite o valor de suas despesas em casa");
		double valorDespesas = sc.nextDouble();
		System.out.println("Digite o valor de tudo pago em dinheiro");
		double tudoEmDinheiro = sc.nextDouble();
		System.out.println("Digite o valor de tudo pago em cartão ");
		double tudoEmCartao = sc.nextDouble();

		double totalDespesas = tudoEmDinheiro + tudoEmCartao + valorDespesas;
		double sobraDoMes = rendaMes - totalDespesas;
		System.out.println("Sobrou: " + sobraDoMes);

		if (totalDespesas > rendaMes) {
			System.out.println("Nome no Serasa");
		} else {
			System.out.println("Deu bom");
	}
		sc.close();
	}
}


