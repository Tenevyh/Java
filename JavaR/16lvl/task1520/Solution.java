import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и перемещать файлы
из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), move().
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        DirectoryStream<Path> stream=Files.newDirectoryStream(sourceDirectory);
        for (Path file:stream){
            if(Files.isRegularFile(file)){
                    Path res = targetDirectory.resolve(file.getFileName());
                    Files.move(file, res);
            }
        }
    }
}

