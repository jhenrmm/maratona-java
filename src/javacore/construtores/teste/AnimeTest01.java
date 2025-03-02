package javacore.construtores.teste;


import javacore.construtores.dominio.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "TV", 64, "Ação", "Pierrot");
        anime.imprime();
    }
}

