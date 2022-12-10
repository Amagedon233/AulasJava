package aulas;

public class peca_teste {
	public static void main (String[]args) {
		peca peca = new peca();
	
	peca.nome = "bisbo";
	peca.posicaoAtualLetra = 'c';
	peca.posicaoAtualNumero = 7;
	
	peca.ValidacaoDeMovimento('g', (byte) 1);
	}
}
	