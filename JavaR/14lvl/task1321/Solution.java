/*
Из switch в if
В классе Solution есть метод getTranslationForDayOfWeek(String),
который возвращает перевод дня недели с английского на русский.
Твоя задача — переписать метод, используя только оператор if-else.
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
       if (ru.equalsIgnoreCase("Понедельник")) {
           en = "Monday";
       } else if (ru.equalsIgnoreCase("Вторник")) {
                en = "Tuesday";
        } else if (ru.equalsIgnoreCase("Среда")) {
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("Четверг")) {
            en = "Thursday";
        } else if (ru.equalsIgnoreCase("Пятница")) {
            en = "Friday";
        } else if (ru.equalsIgnoreCase("Суббота")) {
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("Воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;

    }
}
