package academy.devdojo.maratonajava.javacore.ZZEstream.test;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monotagari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
//        Map<Category, List<LightNovel>>categoryLighNovelMap = new HashMap<>();
//        List<LightNovel> fantasy = new ArrayList<>();
//        List<LightNovel> drama = new ArrayList<>();
//        List<LightNovel> romance = new ArrayList<>();
//        for (LightNovel lightNovel : lightNovels) {
//            switch (lightNovel.getCategory()){
//                case DRAMA: drama.add(lightNovel); break;
//                case FANTASY: fantasy.add(lightNovel); break;
//                case ROMANCE: romance.add(lightNovel); break;
//            }
//        }
//        categoryLighNovelMap.put(Category.DRAMA,  drama);
//        categoryLighNovelMap.put(Category.FANTASY,  fantasy);
//        categoryLighNovelMap.put(Category.ROMANCE,  romance);
//        System.out.println(categoryLighNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
