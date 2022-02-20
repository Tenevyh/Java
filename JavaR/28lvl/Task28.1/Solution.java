import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a=0;
        int max=0;
        String fileName=null;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        fileName= reader.readLine();
        FileInputStream fileRead=new FileInputStream(fileName);
        while(fileRead.available()>0){
            a=fileRead.read();
            if(a>max){
                max=a;
            }
        }
        System.out.println(max);
        reader.close();
        fileRead.close();
    }
}