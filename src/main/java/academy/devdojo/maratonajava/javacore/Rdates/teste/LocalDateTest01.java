package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2025, Month.MARCH.getValue(), 19);
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.getYear());
    }
}
