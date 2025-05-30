package academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
}
