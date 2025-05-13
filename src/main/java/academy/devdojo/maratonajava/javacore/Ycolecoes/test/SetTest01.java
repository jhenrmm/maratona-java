package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(4L, "Berserk", 19.9, 0) );
        mangas.add(new Manga(1L, "Pokemon", 5, 3));
        mangas.add(new Manga(3L, "Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 11.20, 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
