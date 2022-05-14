import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader fileReader=new BufferedReader(new FileReader(fileName1));
        ArrayList<String> symbols=new ArrayList<>();
        while (fileReader.ready()){
            String a= fileReader.readLine();
            symbols.add(a);
        }

        BufferedWriter fileWrite=new BufferedWriter(new FileWriter(fileName2));
        for (String x:symbols){
            fileWrite.write(x.replaceAll("\\p{Punct}", ""));
        }
        reader.close();
        fileReader.close();
        fileWrite.close();

    }
}