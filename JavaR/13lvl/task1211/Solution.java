import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортировка пузырьком
Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
Методы main() и print() не принимают участие в проверке.
*/

public class Solution {

    public static int[] numbers = new int[] {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        Arrays.sort(numbers);
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
