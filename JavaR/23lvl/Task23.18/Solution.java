import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream fin = new FileInputStream(path);
        BufferedReader reader=new BufferedReader(new InputStreamReader(fin));
            int i;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
            reader.close();
            fin.close();
            scanner.close();

    }
}