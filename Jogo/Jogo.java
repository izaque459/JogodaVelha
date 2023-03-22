package Jogo;

import Jogador.IJogador;
import Tabuleiro.ITabuleiro;
import Tabuleiro.Tabuleiro;

public class Jogo {

    private IJogador jogador1;
    private IJogador jogador2;
    private ITabuleiro tabuleiro;
    private IJogador jogadorAtual;

    public Jogo(IJogador jogador1, IJogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = new Tabuleiro();
        this.jogadorAtual = jogador1;
    }

    public void iniciarJogo() {
        System.out.println("Jogo iniciado.");
    }

    public IJogador getJogadorAtual() {
        return jogadorAtual;
    }

    public boolean fazerJogada(int linha, int coluna) {
        boolean jogadaValida = tabuleiro.adicionarJogada(linha, coluna, jogadorAtual);
        if (jogadaValida) {
           System.out.println("Jogador " + jogadorAtual.getNome() + " jogou em (" + String.valueOf(linha) + ", " + String.valueOf(coluna) + ")");
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

    public IJogador getVencedor() {
        return tabuleiro.verificarVencedor();
    }
}
