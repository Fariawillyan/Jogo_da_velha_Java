package Jogo_da_Velha_Java;


import java.util.Random;
import java.util.Scanner;

public class Computador extends Jogador {

	int computadorA;
	int computadorB;
	int computadorC;


	public Computador(int computadorA, int computadorB, int computadorC) {
		super();
		this.computadorA = computadorA; // construtores
		this.computadorB = computadorB;
		this.computadorC = computadorC;
	}

	int jogador = 1;
	int vencedor = Tabuleiro.verificarVencedor();
	Scanner teclado = new Scanner(System.in); // isntanciacao para entrada de dados
	JogoDaVelha jogada = new JogoDaVelha(); // instancia na memorai `new`


	public void computadorA() {


		while (vencedor == 0) { // estrutura de repeticao enquanto for igual a Zero
			System.out.println("Jogador " + jogador);
			System.out.print("Linha: ");

			int linha = teclado.nextInt();

			System.out.print("Coluna: ");

			int coluna = teclado.nextInt();
			if (!jogada.jogar(jogador, linha-1, coluna-1) ) { //condicao para jogador jogar

				System.out.println("Inacabado");

			} else {

				jogador = (jogador == 1) ? 2 : 1;

			}

			Tabuleiro.mostrar();            // msotra tabuleiro
			vencedor = Tabuleiro.verificarVencedor();

		}

		Tabuleiro.mostrar();

		Tabuleiro.resultado(); // mostrar resultado

	}


	public void computadorB() {
		while (vencedor == 0) {

			if (jogador == 2){
				jogador = 1;
				System.out.println("A maquina já jogou ");
			}

			System.out.println("Sua vez Jogador " + jogador);

			System.out.print("Linha: ");

			int linha = teclado.nextInt();

			System.out.print("Coluna: ");

			int coluna = teclado.nextInt();
			if (!jogada.jogar(jogador, linha-1, coluna-1)) {

				System.out.println("Inacabado");

			} else {

				int maquina =2;

				jogador = (jogador == 1) ? maquina : 1;

				if (jogador == maquina) {
					Random random = new Random();

					do {
						linha = random.nextInt(3);
						coluna = random.nextInt(3);
					} while (jogo[linha][coluna] != 0);

					jogo[linha][coluna] = 2;

				}


			}

			Tabuleiro.mostrar();
			vencedor = Tabuleiro.verificarVencedor();
		}

		Tabuleiro.mostrar();

		Tabuleiro.resultado(); //mostrar resultado

	}


	public void computadorC() {
		while (vencedor == 0) {
			System.out.println("Jogador " + jogador);
			System.out.print("Linha: ");

			int linha = teclado.nextInt();

			System.out.print("Coluna: ");

			int coluna = teclado.nextInt();
			if (!jogada.jogar(jogador, linha-1, coluna-1)) {

				System.out.println("Inacabado");

			} else {

				jogador = (jogador == 1) ? 2 : 1;


			}

			Tabuleiro.mostrar();
			vencedor = Tabuleiro.verificarVencedor();

		}

		Tabuleiro.mostrar(); // mostra resultado da partida

		Tabuleiro.resultado(); // mostra resultado

	}

}


