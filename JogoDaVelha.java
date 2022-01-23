package Jogo_da_Velha_Java; // pacote

import java.util.Scanner; // biblioteca apra entrada de dados

public class JogoDaVelha { // classe

	public static void main(String[] args) { // main
		
		
		Scanner teclado = new Scanner(System.in); // instancia para entrada de dados
		JogoDaVelha jogo = new JogoDaVelha();
		Computador comp = new Computador(1, 2, 3); 
			 
		 

		int jogador = 1;		
		int vencedor = Tabuleiro.verificarVencedor(); // verifica vencedor
		
		System.out.println("BEM VINDO AO JOGO DA VELHA");
		System.out.println("Escolha a dificuldade 1, 2 ou 3");// if para escolher dificuldade	
		
		int opcao = teclado.nextInt();		//opcao recebe dado
				
		if (opcao == 1) {	
			System.out.println("Modo Facil");			
			 comp.computadorA();
		}											//estrutura composta de repeticao
		else if (opcao == 2) {
			System.out.println("Modo Medio");
			comp.computadorB();
		}
		else if (opcao == 3) {
			System.out.println("Modo Dificil");
			comp.computadorC();
		}

	}

	protected static int jogo[][] = new int[3][3]; 
	
	//Jogador efetua Jogada
	public boolean jogar(int jogador, int linha, int coluna) {

		if ((linha < 0) || (linha > 2)) {

			return false;

		}

		if ((coluna < 0) || (coluna > 2)) {

			return false;

		}

		if (jogo[linha][coluna] != 0) {

			return false;

		}

		jogo[linha][coluna] = jogador;

		return true;

	}	
	
		
}
	


	


