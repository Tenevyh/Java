import java.util.Scanner;

/*
Reverse
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int[] son=new int[n];
int t=n-1;
int y=n-1;
for (int a=0;n>a;a++) {
son[a]=scanner.nextInt();
}
if ((n%2)==0) {
for (int i = t; i >= 0; i--) {
System.out.println(son[i]);
}
} else {
for (int u = 0; y >=u; u++) {
System.out.println(son[u]);
}
}
}
}