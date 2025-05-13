package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1000), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareNonStatic);
        System.out.println(animeList);
//        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super campeões", 36));

    }
}
