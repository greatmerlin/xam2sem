package FFHS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, Month.OCTOBER, 5);

        System.out.println(date);

        date = date.plusDays(5).plusMonths(2);

        System.out.println(date);

        // same for Local Time and Local Date Time

        //before java 8

        Date date1 = new Date();

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date1);  // setting time to current time

        System.out.println(date1);

        System.out.println(calendar);

        calendar.set(Calendar.DATE, 4);
        calendar.set(Calendar.MONTH, 3);

        date1 = calendar.getTime(); // getting the time by saving into a var

        System.out.println(date1);
    }
}
