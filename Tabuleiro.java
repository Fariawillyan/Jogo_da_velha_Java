package Jogo_da_Velha_Java;

public class Tabuleiro extends Jogador  {	 // jogador herda de tabulerio

	public void JogoDaVelha() { // mostra tabuleiro jogo da velha

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				jogo[i][j] = 0;

			}

		}

	}


	public static void mostrar() { // classe mostrar

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(jogo[i][j] + " ");

			}

			System.out.println();

		}

	}


	public static int verificarVencedor() { // verifica vencedor

		for (int i = 0; i < 3; i++) {

			if ((jogo[i][0] == jogo[i][1]) && (jogo[i][0] == jogo[i][2])) {

				if (jogo[i][0] != 0) {

					return jogo[i][0];

				}

			}

		}

		for (int j = 0; j < 3; j++) {

			if ((jogo[0][j] == jogo[1][j]) && (jogo[0][j] == jogo[2][j]) &&	(jogo[0][j] != 0)) {

				return jogo[0][j];

			}

		}

		if ((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]) &&	(jogo[0][0] != 0)) {

			return jogo[0][0];

		}

		if ((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0]) &&	(jogo[0][2] != 0)) {

			return jogo[0][2];

		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (jogo[i][j] == 0) {

					return 0;

				}

			}

		}

		return 3;
	}
	
	Tabuleiro resultado = new Tabuleiro();
	
		public static void resultado() {
			
			
	int vencedor = Tabuleiro.verificarVencedor();
	
	
	switch (vencedor) {

	case 1 :

		System.out.println("Vit�ria");

		break;

	case 2:

		System.out.println("Derrota");

		break;

	case 3:

		System.out.println("Empatado");

		break;

	}
		}
	
	
}
