import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSC=new int[128];
        try(FileReader reader= new FileReader(args[0])){
            while (reader.ready()){
                aSC[reader.read()]++;
            }
        }
        for (int i=0; i<aSC.length; i++){
            if (aSC[i]!=0){
                System.out.println((char) i+ " "+ aSC[i]);
            }
        }
    }
}
