/*
Правильные типы
Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
Изменять типы переменных a, b, c и d нельзя.
*/

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
    a=(byte)value;
    b=(short)value;
    c=(int)value;
    d=value;
    }
}