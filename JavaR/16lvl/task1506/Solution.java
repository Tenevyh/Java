import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает символы из этого файла
(используй метод readAllLines(Path) класса Files)
 и выводит на экран все, за исключением точки, запятой и пробела.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
             List<String> file = Files.readAllLines(Paths.get(scanner.nextLine()));
             for(int i=0;i< file.size();i++) {
                 String line = (String) file.get(i);
                 for (int j = 0; j < line.length(); j++) {
                     char next = line.charAt(j);
                     if (next != ' ' && next != '.' && next != ',') {
                         System.out.print(next);
                     }
                 }
             }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



