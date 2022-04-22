import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.
*/

public class Solution {
    private static int counter=0;
    
    public static void main(String[] args) throws Exception {
        
        String fileName;
        
        try(BufferedReader reader= new BufferedReader (new InputStreamReader(System.in))){
            fileName=reader.readLine();
        }
        
        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)){
            char currentChar;
            while (reader.ready()){
                currentChar = (char) reader.read();
                text.append(currentChar);
            }
        }
        
        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        
        for (String s: replacedString.split(" ")){
            if (s.equals("world")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}