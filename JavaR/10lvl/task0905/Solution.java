import java.util.Scanner;
import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}

Метод main() не принимает участие в тестировании.

Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int result=0;
        if (decimalNumber<=0){
            return 0;
        }
        while (decimalNumber != 0) {
            int temp = (int)((decimalNumber % 8) * Math.pow(10, i));
            result+=temp;
            i++;
            decimalNumber /= 8;

        }
        return result;
    }


    public static int toDecimal(int octalNumber) {
        int i = 0;
        int result=0;
        if (octalNumber<=0) {
            return 0;
        }
        while(octalNumber!=0) {
            int temp = (int) ((octalNumber % 10) * (Math.pow(8, i)));
            result+=temp;
            i++;
            octalNumber /= 10;

        }
        return result;
    }
}
