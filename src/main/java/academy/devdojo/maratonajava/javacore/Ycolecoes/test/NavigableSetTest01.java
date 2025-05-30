package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(4L, "Berserk", 19.9, 0) );
        mangas.add(new Manga(1L, "Pokemon", 5, 3));
        mangas.add(new Manga(3L, "Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 11.20, 0));
        mangas.add(new Manga(10L, "Aaragon", 11.20, 1));

        for ( Manga manga: mangas){
            System.out.println(manga);
        }

        Manga yuyu = new Manga(4L, "Yuyu Hakusho", 5, 0);

        // lower <
        // floor <=
        // higher >
        // ceiling >
        System.out.println("=======================");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

    }
}
