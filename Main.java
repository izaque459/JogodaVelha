import java.util.Scanner;

import Jogador.Jogador;
import Jogo.Jogo;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do jogador 1:");
        String nomeJogador1 = scanner.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1,'X');
        System.out.println("Digite o nome do jogador 2:");
        String nomeJogador2 = scanner.nextLine();
        Jogador jogador2 = new Jogador(nomeJogador2, 'O');
        
        
        // Cria o objeto Jogo e inicia o jogo
        Jogo jogo = new Jogo(jogador1,jogador2);
        jogo.iniciarJogo();
        jogo.fazerJogada(0,0);
    }

}
