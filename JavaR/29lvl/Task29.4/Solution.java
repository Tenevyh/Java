import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner=fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] s=fileScanner.nextLine().split(" ");
            String firstName=s[1];
            String middleName=s[2];
            String lastName=s[0];
            Calendar calendar = new GregorianCalendar(Integer.parseInt(s[5]) , Integer.parseInt(s[4])-1 ,Integer.parseInt(s[3]) );
            Date birthDate=calendar.getTime();
            return new Person(firstName,middleName,lastName,birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}