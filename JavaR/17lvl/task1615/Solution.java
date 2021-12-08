import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой как много методов!
В классе Solution реализуй шесть методов:

в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        instant=instant.plusSeconds(minutes*60);

        return instant;
    }

    static public Instant plusHours(Instant instant, long hours) {
        instant=instant.plusSeconds(hours*60*60);
        
        return instant;
    }

    static public Instant plusDays(Instant instant, long days) {
        instant=instant.plusSeconds(days*60*60*24);

        return instant;
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        instant=instant.minusSeconds(minutes*60);

        return instant;
    }

    static public Instant minusHours(Instant instant, long hours) {
        instant=instant.minusSeconds(hours*60*60);

        return instant;
    }

    static public Instant minusDays(Instant instant, long days) {
        instant=instant.minusSeconds(days*60*60*24);

        return instant;
    }
}
