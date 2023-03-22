package Jogo;

import Jogador.IJogador;

public interface IJogo {

    void iniciarJogo();

    IJogador getJogadorAtual();

    boolean fazerJogada(int linha, int coluna);

    boolean jogoAcabou();

    IJogador getVencedor();

}