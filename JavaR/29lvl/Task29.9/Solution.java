import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
Результат вывести во второй файл.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        BufferedReader fileReader=new BufferedReader(new FileReader(fileName1));

        ArrayList<Character> symbols=new ArrayList<>();
        while (fileReader.ready()){
            int a=fileReader.read();
            symbols.add((char)a);
        }

        BufferedWriter fileWriter=new BufferedWriter(new FileWriter(fileName2));
        for (Character a: symbols){
            if(a=='.'){
                a='!';
            }
            fileWriter.write(a);
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}