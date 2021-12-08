import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.
*/

public class Solution {

    static Date birthDate=new Date("April 10 18:00:00 1997");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String e="Не могу распознать";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return e;
    }
}
