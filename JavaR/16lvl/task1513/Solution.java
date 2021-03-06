import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке, после чего в консоли выводится диск (корень для Unix-like), на котором находится этот файл (или папка).
Для решения задачи используй Path и его методы.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        System.out.print(Path.of(str).getRoot());
    }
}

