package Jogo_da_Velha_Java;

public class Tabuleiro extends Jogador {     // jogador herda de tabulerio


    public static void mostrar() { // classe mostrar

        System.out.println("-------");
        for (int i = 0; i < jogo.length; i++) {
            System.out.print("|");
            for (int j = 0; j < jogo[i].length; j++) {
                System.out.print(jogo[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
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

            if ((jogo[0][j] == jogo[1][j]) && (jogo[0][j] == jogo[2][j]) && (jogo[0][j] != 0)) {

                return jogo[0][j];

            }

        }

        if ((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]) && (jogo[0][0] != 0)) {

            return jogo[0][0];

        }

        if ((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0]) && (jogo[0][2] != 0)) {

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

    public static void resultado() {

        int vencedor = Tabuleiro.verificarVencedor();

        switch (vencedor) {

            case 1 -> System.out.println("Vitoria");

            case 2 -> System.out.println("Derrota");

            case 3 -> System.out.println("Empatado");
        }
    }


}
