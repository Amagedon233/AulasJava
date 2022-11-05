package aulas;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String [] args) {
//		Carro c1 = new Carro();
//		
//		c1.marca = "Ford";
//		c1.modelo = "Fiesta";
//		for (int i = 0; i < 5; i++) 
//			c1.somarPercurso();
//		c1.mostrarTotalKm();
//		System.out.println("======================");
//		
//		Carro c2 = new Carro();
//		
//		c2.marca = "Jeep";
//		c2.modelo = "Renegade";
//		for (int j = 0; j < 5; j++) 
//			c2.somarPercurso();
//		c2.mostrarTotalKm();
//		System.out.println("======================");
//		
	
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Informe quantos carros serão informados");
		int carros = sc.nextInt();
		for (int k = 0; k < carros; k++); {
			Carro c1 = new Carro();
			
			System.out.println("Informe a marca");
			c1.marca = Integer.parseInt(sc.nextLine();
			System.out.println("Informe o modelo");
			c1.modelo = sc.nextLine();
			System.out.println("Quantos percursos");
			int percursos = sc.nextInt();

			for (int i = 0; i < percursos; i++) 
				c1.somarPercurso();
			c1.mostrarTotalKm();
			System.out.println("======================");
		}
		sc.close();
	}
	
}
