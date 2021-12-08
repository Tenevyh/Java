import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)

Реализуй два метода:

в методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> all=new TreeSet<String>();
        all.addAll(ZoneId.getAvailableZoneIds());
        return all;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time = ZonedDateTime.now(zone);

        return time;
    }
}
