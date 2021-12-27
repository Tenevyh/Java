import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner1=new Scanner(System.in);
        String fileName=scanner1.nextLine();
        FileInputStream fileRead=new FileInputStream(fileName);
        
        List<Integer> listCheck=new ArrayList<>();
        Scanner scanner=new Scanner(fileRead);
        
        while (scanner.hasNext()){
            int x= scanner.nextInt();
            if (x%2==0){
                listCheck.add(x);
            }
        }
        Collections.sort(listCheck);
        
        for (int a:listCheck){
            System.out.println(a);
        }
        scanner.close();
        fileRead.close();
    }
}