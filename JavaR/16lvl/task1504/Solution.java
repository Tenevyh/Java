package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в файл2,
но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in);
        InputStream file1=Files.newInputStream(Paths.get(scanner.nextLine()));
        OutputStream file2=Files.newOutputStream(Paths.get(scanner.nextLine()))){
            byte[] input=file1.readAllBytes();
            byte[] output=new byte[input.length];
            for(int i=0;i<input.length;i+=2) {
                if (i < input.length - 1) {
                    output[i] = input[i + 1];
                    output[i + 1] = input[i];
                } else {
                    output[i] = input[i];
                }
            }
            file2.write(output);
            file1.close();
            file2.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
