import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Integer a=Integer.parseInt(reader.readLine());
        Integer b=Integer.parseInt(reader.readLine());
        while(a!=b){
              if (a > b){
            a = a - b;
        }else {
            b = b - a;
        }
        }
        System.out.println(a);

        reader.close();
    }
}