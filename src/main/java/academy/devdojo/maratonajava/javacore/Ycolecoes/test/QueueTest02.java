package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(4L, "Berserk", 19.9, 0) );
        mangas.add(new Manga(1L, "Pokemon", 5, 3));
        mangas.add(new Manga(3L, "Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 11.20, 0));
        mangas.add(new Manga(10L, "Aaragon", 11.20, 1));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
