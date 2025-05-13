package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01{
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bleach", "TV", 12, "Ação");
        anime.imprime();
    }
}

