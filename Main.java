import java.util.Scanner;

import Jogador.Jogador;
import Jogo.IJogo;
import Jogo.Jogo;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do jogador 1:");
        String nomeJogador1 = scanner.nextLine();
       // Jogador jogador1 = new Jogador(nomeJogador1,'X');
        System.out.println("Digite o nome do jogador 2:");
        String nomeJogador2 = scanner.nextLine();
       // Jogador jogador2 = new Jogador(nomeJogador2, 'O');
       int linha = 0;
       int coluna =0;
        
        
        // Cria o objeto Jogo e inicia o jogo
        IJogo jogo = new Jogo(new Jogador(nomeJogador1,'X'),new Jogador(nomeJogador2, 'O'));
        jogo.iniciarJogo();
        while(!jogo.jogoAcabou()){
            System.out.println("Jogador Atual "+jogo.getJogadorAtual().getNome() + " realize sua jogada:");
            System.out.print("Digite o numero da linha: ");
            linha = scanner.nextInt();
            System.out.print("Digite o numero da coluna: ");
            coluna = scanner.nextInt();
            jogo.fazerJogada(linha,coluna);

        }
    }

}
