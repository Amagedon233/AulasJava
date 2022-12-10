package aulas;

public class peca {
	
	String nome;
	char posicaoAtualLetra;
	byte posicaoAtualNumero;

	public void ValidacaoDeMovimento(char posicaoDesejadaLetra, byte posicaoDesejadaNumero) {
		System.out.println("pL:" + posicaoDesejadaLetra + "\nPn:" + posicaoDesejadaNumero);
		
		switch (nome) {
		case "torre":
			if(posicaoAtualLetra != posicaoDesejadaLetra && posicaoAtualNumero != posicaoDesejadaNumero) {
				System.out.println("peca invalida");
			} else { 
				System.out.println("valido");
			}
			break;
		case "bisbo":
			int deslocamento = posicaoAtualNumero - posicaoDesejadaNumero;
			char letraDestinoPossivel1 = (char) (posicaoAtualLetra + deslocamento);
			char letraDestinoPossivel2 = (char) (posicaoAtualLetra - deslocamento);
			
			if(letraDestinoPossivel1 == posicaoDesejadaLetra || letraDestinoPossivel2 == posicaoDesejadaLetra) {
				System.out.println("Valido");
			} else { 
				System.out.println("Invalido");
			}
			break;
			
		default:
			System.out.println("peca invalida");
			break;
		}
	}

}
