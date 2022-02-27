import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileInputStream fileInS=new FileInputStream(fileName);
        int c=0;
        int a=0;
        
         while (fileInS.available()> 0) {
             a=fileInS.read();
            if(a==44){
                c+=1;
            }
        }
        System.out.println(c);
        reader.close();
        fileInS.close();
        
    }
}