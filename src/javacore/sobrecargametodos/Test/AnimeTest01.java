package javacore.sobrecargametodos.Test;

import javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01{
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bleach", "TV", 12, "Ação");
        anime.imprime();
    }
}

