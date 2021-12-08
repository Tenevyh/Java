import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
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
                    Files.copy(file, res);
    
            }
        }
    }
}

