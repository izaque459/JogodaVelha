package Jogo;

import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    private Jogador jogadorAtual;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = new Tabuleiro();
        this.jogadorAtual = jogador1;
    }

    public void iniciarJogo() {
        System.out.println("Jogo iniciado.");
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public boolean fazerJogada(int linha, int coluna) {
        boolean jogadaValida = tabuleiro.adicionarJogada(linha, coluna, jogadorAtual);
        if (jogadaValida) {
            System.out.println("Jogador " + jogadorAtual.getNome() + " jogou em (" + linha + ", " + coluna + ")");
            if (tabuleiro.verificarVencedor() != null) {
                System.out.println("Jogador " + jogadorAtual.getNome() + " venceu!");
            } else if (tabuleiro.isTabuleiroCheio()) {
                System.out.println("Jogo empatado!");
            } else {
                jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
            }
            return true;
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
            return false;
        }
    }

    public boolean jogoAcabou() {
        return tabuleiro.verificarVencedor() != null || tabuleiro.isTabuleiroCheio();
    }

    public Jogador getVencedor() {
        return tabuleiro.verificarVencedor();
    }
}
