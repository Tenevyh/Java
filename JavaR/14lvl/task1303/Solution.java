import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
В классе Solution есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества, используя iterator().
Метод main не участвует в проверке.


*/

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String> word =words.iterator();
        while (word.hasNext()){
            String str= word.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}