package FFHS;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2019, Month.APRIL, 30);

       // start.toEpochDay(); // number of days since January 1 1970
        // java has a Period class that we can use

        Period period = Period.ofWeeks(1);

        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
//        System.out.println(LocalTime.now().plus(period));
        // Time does have days, only time.


    }

/*    public static void cleanAnimalCage(LocalDate start, LocalDate end){
        while(start.isBefore(end)){
            System.out.println("need to clean the cage on date = " + start);
            start = start.plusMonths(1); // adding one month after each loop
        }
    }*/
        public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
            while (start.isBefore(end)) {
                System.out.println("need to clean the cage on date = " + start);
                start = start.plus(period);
            }
        }

}
