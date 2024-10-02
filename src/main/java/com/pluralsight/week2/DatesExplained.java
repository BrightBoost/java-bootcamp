package com.pluralsight.week2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesExplained {
    public static void main(String[] args) {
        // type for just a date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ldYouNeedToUnderstandConstructors = ld.plusWeeks(3);
        System.out.println(ldYouNeedToUnderstandConstructors);

        LocalDate ld1 = LocalDate.of(2092, 4, 6);
        System.out.println(ld1);

        // type for just a time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalTime lt1 = LocalTime.of(13, 14, 22);
        System.out.println(lt1);

        // type for a date and a time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // maaike going wild with the formatter
        // probably wont pass any code review
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM MM MMM yyyy dd");
        System.out.println(dtf.format(ld1));

        LocalDateTime ldt1 = LocalDateTime.of(ld, lt);
        LocalDateTime ldt2 = LocalDateTime.of(2092, 4, 6, 12, 12, 3);

        // type for a date and a time in a specific time zone
    }
}
