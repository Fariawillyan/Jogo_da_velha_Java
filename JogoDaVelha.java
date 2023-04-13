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


        int opcao = 5; //opcao recebe dado

        while (opcao != 0){

            System.out.println("Escolha a dificuldade 1, 2, 3 ou 0 para sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Modo Facil (Voce contra Voce)");
                    comp.computadorA();
                }

                case 2 -> {
                    System.out.println("Modo Medio (Você contra a Maquina)");
                    comp.computadorB();
                }

                case 3 -> {
                    System.out.println("Modo Dificil (em breve)");
                    comp.computadorC();
                }
            }

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






