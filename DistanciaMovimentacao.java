package aulas;

public class DistanciaMovimentacao {

	public static void main(String[] args) {
		
		int quantidadePercursos = 2;
		double quantidadeKm = 0;
		double totalKm = 0;
		
		for (int i = 0; i < quantidadePercursos; i++) {
			//Capturar o dano do usuario/carro
			quantidadeKm = 1 + (Math.random() * 49);
			System.out.println("Percurso " + i + " : " + quantidadeKm);
			totalKm += quantidadeKm;
		}
		System.out.println("Total percorrido: " + totalKm);
	
	}
	
}
