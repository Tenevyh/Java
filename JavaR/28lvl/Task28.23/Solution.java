import java.io.*;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1= reader.readLine();
        String fileName2= reader.readLine();

        try (BufferedReader readerR=new BufferedReader(new FileReader(fileName1));
                PrintWriter fileW=new  PrintWriter(new FileWriter(fileName2))) {

                    while (readerR.ready()) {
                        String[] splittedLine = readerR.readLine().split(" ");
                        for (String numberInString : splittedLine) {
                            double number = Double.parseDouble(numberInString);
                            long round = Math.round(number);
                            fileW.print(round + " ");
                        }
                    }
                }
    }
}