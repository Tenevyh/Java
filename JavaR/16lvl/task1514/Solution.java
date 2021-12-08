package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоли относительный путь между этими путями, если он существует. В противном случае выводить ничего не нужно.

Подсказка: если не удалось найти относительный путь между путь1 и путь2, попробуй найти относительный путь между путь2 и путь1.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path way1=Path.of(str1);
        Path way2=Path.of(str2);
        try {
            System.out.println(way1.relativize(way2));
        } catch (Exception e) {
            try {
                System.out.println(way2.relativize(way1));
            } catch (Exception ignore) {

            }
        }
    }
}

