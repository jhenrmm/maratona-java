package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(3L, "Attack on Titan", 3.2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 11.20));

        Collections.sort(mangas);

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon Ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
