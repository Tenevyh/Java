import java.util.*;

/* 
Переводим итератор в цикл for-each
В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>), которые выводят все элементы из переданных коллекций — списка и множества — с новой строки. Твоя задача переписать методы на использование цикла for-each.
Метод main не участвует в проверке.
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (String s: words) {
            System.out.println(s);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String str:words){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
