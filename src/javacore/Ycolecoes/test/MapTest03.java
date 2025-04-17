package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(4L, "Berserk", 19.9);
        Manga manga2 = new Manga(1L, "Pokemon", 9.5);
        Manga manga3 = new Manga(3L, "Attack on Titan", 3.2);
        Manga manga4 = new Manga(2L, "Dragon Ball Z", 11.20);
        List<Manga> mangaConsumidor1List = List.of(manga1, manga2);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println("---"+entry.getKey().getNome()+":");
            for(Manga manga : entry.getValue()){
                System.out.println("-----"+manga.getNome());
            }
        }

    }
}
