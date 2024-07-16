import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("STEP 2");
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime future=now.plusWeeks(2);
        System.out.println("with LocalDateTime "+now);
        System.out.println(future);
        System.out.println("-----------------");
        System.out.println("with ZonedDateTime "+ ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().plusWeeks(2));
        System.out.println("with Instant "+Instant.now().atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println("STEP 3");
        isBefore(now,future);

        System.out.println("-----------------");
        System.out.println("STEP 4");
        LocalDateTime startTime=LocalDateTime.of(2024,6,25,10,0);
        LocalDateTime endTime=LocalDateTime.of(2024,7,16,11,30);

        long daysBetween=ChronoUnit.DAYS.between(startTime,endTime);
        System.out.println("Days between "+daysBetween);
        System.out.println("-----------------");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatter "+LocalDateTime.now().format(formatter));
    }
    public static void isBefore(LocalDateTime now, LocalDateTime future){
        if(now.isBefore(future)){
            System.out.println("Now is before future");
        } else {
            System.out.println("Now is after future");
        }

    }
}
