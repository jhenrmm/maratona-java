package javacore.associacao.teste;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogador --- ");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
