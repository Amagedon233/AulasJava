package aulas;

import java.util.Scanner;

public class Areas {

	public static void calcular() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe o valor do metro quadrado");
		double valorMetroQuadrado = sc.nextDouble();
		System.out.println("Informe a quantidade de paredes");
		short quantidadeAreas = sc.nextShort();
		double totalMetrosQuadrados = 0;
		double totalValorOrcamento = 0;
		double metroX, metroY, areaParede, valorParede;
		
		for(int i = 0; i < quantidadeAreas; i++) {
			System.out.println("Informe o valor(em metros) x da parede " + i);
			metroX = sc.nextDouble();
			System.out.println("Informe o valor(em metros) y da parede " + i);
			metroY = sc.nextDouble();
			areaParede = metroX * metroY;
			valorParede = areaParede * valorMetroQuadrado;
			System.out.println("Area da parede "  + i + " é "  + areaParede);
			System.out.println("Valor da parede " + i + " é "  + valorParede);
			
			totalMetrosQuadrados = totalMetrosQuadrados + areaParede;
			totalValorOrcamento += valorParede;
		}
		System.out.println("\n\n----======ORCAMENTO=======----");
		System.out.println("Area Total : "  + totalMetrosQuadrados);
		System.out.println("Valor Total: "+ totalValorOrcamento);
		System.out.println("----======ORCAMENTO=======----");
		
		sc.close();
	}

}
