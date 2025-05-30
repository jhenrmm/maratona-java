package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(4L, "Berserk", 19.9);
        Manga manga2 = new Manga(1L, "Pokemon", 9.5);
        Manga manga3 = new Manga(3L, "Attack on Titan", 3.2);
        Manga manga4 = new Manga(2L, "Dragon Ball Z", 11.20);
        System.out.println(consumidor1);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry: consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+ " - "+ entry.getValue().getNome());
        }
    }
}
