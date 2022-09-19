package pl.camp.it.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);

        LocalDate data = LocalDate.of(2022, 8, 17);
        LocalDate currentDate = LocalDate.now();

        //System.out.println(data);
        //System.out.println(currentDate);

        LocalTime time = LocalTime.of(10, 54, 30);
        //System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.of(data, time);
        //System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 9, 17, 15, 30, 20);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Paris"));

        //System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2022, 5, 7, 12, 30, 45, 0, ZoneId.of("Europe/Paris"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2022, 8, 10, 12, 35, 45, 0, ZoneId.of("Europe/Paris"));

        Instant instant1 = zonedDateTime1.toInstant();
        Instant instant2 = zonedDateTime2.toInstant();

        Duration przedzialCzasu = Duration.between(instant1, instant2);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(przedzialCzasu.toMillis());

        ZonedDateTime jakisCzas = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2022, 9, 17),
                        LocalTime.of(14, 14, 14)),
                ZoneId.of("Europe/Paris")
        );

        LocalDate lokalnaData = LocalDate.of(2022, 9, 17);

        LocalDate dataZaDziesiecDni = lokalnaData.plusDays(50);

        System.out.println(dataZaDziesiecDni);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String dataPoFormatowaniu = lokalnaData.format(formatter);

        System.out.println(dataPoFormatowaniu);

        String dataStringowa = "07.07.2022";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate dataSformatowana = LocalDate.parse(dataStringowa, formatter2);

        System.out.println(dataSformatowana);
    }
}
