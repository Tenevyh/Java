import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
В методе main выведи на экран переменную localDateTime в таком виде:
19.03.2020г. 5ч.4мин
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd.MM.yyyy"+"г. "+ "H"+"ч."+"m"+"мин");
        String timeForm=form.format(localDateTime);
        System.out.println(timeForm);
    }
}
