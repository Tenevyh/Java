import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        String file3=reader.readLine();
        FileInputStream readFile=new FileInputStream(file1);
        FileOutputStream writeFile2=new FileOutputStream(file2);
        FileOutputStream writeFile3=new FileOutputStream(file3);
        
              int halfOfFile = (readFile.available() + 1) / 2;
            int numberOfByte = 0;
            while (readFile.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    writeFile2.write(readFile.read());
                    numberOfByte++;
                } else writeFile3.write(readFile.read());
            }
 
        reader.close();
        readFile.close();
        writeFile2.close();
        writeFile3.close();
}
}