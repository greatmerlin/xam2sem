package FFHS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate date = LocalDate.parse("02 15 2010", formatter);

        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);

        String text = date.format(formatter);
        System.out.println(text);

        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);
    }
}
