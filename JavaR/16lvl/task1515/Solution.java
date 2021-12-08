import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
Напиши код, который будет считывать с клавиатуры путь
и выводить его в консоли, при этом если путь не абсолютный,
то перед выводом его нужно преобразовать к таковому.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path way1=Path.of(str);
        if(way1.isAbsolute()){
            System.out.print(str);
        } else {
            System.out.print(way1.toAbsolutePath());
        }
    }
}

