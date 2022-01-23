package Jogo_da_Velha_Java;

public class Jogador extends JogoDaVelha { // jogador herda da Main

	
	public boolean jogar(int jogador, int linha, int coluna) { // boolean retorna verdadeiro ou falso

		if ((linha < 0) || (linha > 2)) {

			return false;

		}

		if ((coluna < 0) || (coluna > 2)) {

			return false;

		}

		if (jogo[linha][coluna] != 0) {

			return false;

		}

		jogo[linha][coluna] = jogador; // verifica linha e coluna e retorna verdadeiro

		return true;

	}	
	
	
	
}
