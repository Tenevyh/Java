import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        FileInputStream readFile1=new FileInputStream(file1);
        FileOutputStream writeFile2=new FileOutputStream(file2);
            List<Integer> inputBytes = new ArrayList<>();
            while (readFile1.available() > 0) {
                inputBytes.add(readFile1.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                writeFile2.write(aByte);
            }
            reader.close();
            readFile1.close();
            writeFile2.close();
    }
}
