package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(timeNow.get(ChronoField.HOUR_OF_AMPM));
    }
}
