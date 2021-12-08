import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/* 
Из потока данных — в строку
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        String s=stringStream.collect(joining(" "));
        return s;
    }
}
