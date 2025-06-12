package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("D01= " + d01);
        System.out.println("D02= " + d02);
        System.out.println("D03= " + d03);
        System.out.println("D04= " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("D05=" + d05.format(fmt2));

    }

}
