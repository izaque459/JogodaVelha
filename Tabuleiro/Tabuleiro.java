package Tabuleiro;

import Jogador.IJogador;

public class Tabuleiro {

    private static final int TAMANHO = 3;
    private IJogador[][] matriz;
    private int jogadas;

    public Tabuleiro() {
        this.matriz = new IJogador[TAMANHO][TAMANHO];
        this.jogadas = 0;
    }

    public boolean adicionarJogada(int linha, int coluna, IJogador jogador) {
        if (matriz[linha][coluna] != null) {
            return false;
        } else {
            matriz[linha][coluna] = jogador;
            jogadas++;
            return true;
        }
    }

    public boolean isTabuleiroCheio() {
        return jogadas == TAMANHO * TAMANHO;
    }

    public IJogador verificarVencedor() {
        for (int i = 0; i < TAMANHO; i++) {
            // Verifica linhas
            if (matriz[i][0] != null && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                return matriz[i][0];
            }
            // Verifica colunas
            if (matriz[0][i] != null && matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i]) {
                return matriz[0][i];
            }
        }
        // Verifica diagonais
        if (matriz[0][0] != null && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return matriz[0][0];
        }
        if (matriz[0][2] != null && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return matriz[0][2];
        }
        return null;
    }
}
