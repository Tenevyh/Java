import java.io.*;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1= reader.readLine();
        String fileName2= reader.readLine();

        try(FileInputStream fileR1=new FileInputStream(fileName1);
                FileOutputStream fileW=new FileOutputStream(fileName1);
        FileInputStream fileR=new FileInputStream(fileName2)){
            BufferedReader readF1=new BufferedReader(new FileReader(fileName1));
        while (fileR.available()>0){
            fileW.write(fileR.read());
        }
        while (readF1.ready()) {
            fileW.write(readF1.read());
        }
        }
    }
}