import java.io.*;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        try (FileOutputStream fileW = new FileOutputStream(fileName1);
             FileInputStream fileR = new FileInputStream(fileName2);
             FileInputStream fileR1 = new FileInputStream(fileName3)) {

            while (fileR.available() > 0) {
                fileW.write(fileR.read());
            }
            while (fileR1.available() > 0) {
                fileW.write(fileR1.read());
            }
        }
    }
}
