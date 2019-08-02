package FFHS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate ld = LocalDate.of(2019, Month.OCTOBER, 30);
        LocalTime lt = LocalTime.of(10,30);

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(LocalDateTime.of(ld, lt));

        System.out.println(new Date());

        Calendar c = Calendar.getInstance();

        c.set(2019, Calendar.JANUARY, 1);

        Date jan = c.getTime();

        System.out.println(jan);
    }
}
