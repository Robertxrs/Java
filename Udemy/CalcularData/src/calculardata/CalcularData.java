package calculardata;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalcularData {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-12-06");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-06T01:30:26");
        Instant d06 = Instant.parse("2023-12-06T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

    }

}
