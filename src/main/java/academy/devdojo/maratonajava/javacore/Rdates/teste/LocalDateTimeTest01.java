package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMonth());
    }
}
