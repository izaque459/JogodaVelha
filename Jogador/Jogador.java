package Jogador;
public class Jogador implements IJogador{
    
    private String nome;
    private char simbolo;

    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public char getSimbolo() {
        return simbolo;
    }
}
