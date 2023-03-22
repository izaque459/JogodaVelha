package Tabuleiro;

import Jogador.IJogador;

public interface ITabuleiro {

    boolean adicionarJogada(int linha, int coluna, IJogador jogador);

    boolean isTabuleiroCheio();

    IJogador verificarVencedor();

}