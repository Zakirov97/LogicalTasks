package kz.dias.day_of_the_programmer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        return LocalDate.of(year, 1, 1).plusDays(255).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
