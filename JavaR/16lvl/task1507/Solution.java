import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

        for (int i=0;i<lines.size();i+=2){
            String s=lines.get(i);
                System.out.println(lines.get(i));
            }
        }
    }


