import java.time.LocalDate;

/* 
Освоение нового API
В классе Solution реализуй 4 метода:

метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate nowTime=LocalDate.now();

        return nowTime;
    }

    static LocalDate ofExample() {
        LocalDate ex1=LocalDate.of(2020,9,12);

        return ex1;
    }

    static LocalDate ofYearDayExample() {
        LocalDate ex2=LocalDate.ofYearDay(2020,256);

        return ex2;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate ex3=LocalDate.ofEpochDay(18517);

        return ex3;
    }
}
