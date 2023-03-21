package Jogo;

import java.util.Scanner;

import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    private Jogador jogadorAtual;

    public Jogo(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
        this.jogadorAtual = jogador1;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Começando jogo da velha!");

        while (!tabuleiro.estaCompleto() && !tabuleiro.haVencedor()) {
            System.out.println("\n\n");
            tabuleiro.mostrar();

            System.out.println("\n" + jogadorAtual.getNome() + ", é sua vez de jogar. Escolha uma posição (1-9):");
            int posicao = scanner.nextInt();

            if (!tabuleiro.ocupar(posicao, jogadorAtual.getSimbolo())) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            if (jogadorAtual == jogador1) {
                jogadorAtual = jogador2;
            } else {
                jogadorAtual = jogador1;
            }
        }

        System.out.println("\n\n");
        tabuleiro.mostrar();

        if (tabuleiro.haVencedor()) {
            System.out.println("\nParabéns, " + jogadorAtual.getNome() + "! Você venceu!");
        } else {
            System.out.println("\nEmpate!");
        }
    }
}
