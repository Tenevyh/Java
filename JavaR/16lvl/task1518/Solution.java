import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
Напиши программу, которая будет считывать с клавиатуры путь к директории, получать список файлов и директорий в заданной директории и выводить в консоли информацию о них в виде:
"<путь к файлу> - это файл", если это файл,
"<путь к директории> - это директория", если это директория.
Треугольные скобки и кавычки выводить не нужно.
Используй соответствующие методы класса Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        DirectoryStream<Path> files=Files.newDirectoryStream(directory);
        for(Path dir:files){
            if(Files.isRegularFile(dir)){
                System.out.println(dir.toString() + THIS_IS_FILE);
            } else if (Files.isDirectory(dir)){
                System.out.println(dir.toString() + THIS_IS_DIR);
            
            }
        }
    }
}

