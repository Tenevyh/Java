import java.util.stream.Stream;

/* 
javarush
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        Stream<String> upperCase=strings.map(String::toUpperCase);
        return upperCase;
    }
}
