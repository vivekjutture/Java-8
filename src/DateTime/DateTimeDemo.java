package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class DateTimeDemo {
    private static Long fact(Long n) {
        long fact = 1L;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());


        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getHour());

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        System.out.println(nowDateTime.minusMonths(100));

        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        System.out.println(nowZonedDateTime);
        ZoneId zone = nowZonedDateTime.getZone();
        System.out.println(zone);
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        Instant start = Instant.now();
        Stream.iterate(1L, x -> x + 1).limit(20000).map(DateTimeDemo::fact).toList();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        Duration d = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(d);

        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1983, 2, 2);
        Period period = Period.between(now, then);
        System.out.println(period);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(localDate.format(formatter));
        String date = "25/Jan/1983";
        LocalDate date1 = LocalDate.parse(date, formatter);
        System.out.println(date1);
    }
}
