import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.


*/

public class Solution {
    private final static Character[] ENGLISH_CHARS_ARRAY = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
            , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final static Set<Character> ENGLISH_CHAR=new HashSet<>(Arrays.asList(ENGLISH_CHARS_ARRAY));
    public static void main(String[] args) throws IOException {
        int count=0;
        try(FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                char ch=(char) fileReader.read();
                if (ENGLISH_CHAR.contains(ch)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}