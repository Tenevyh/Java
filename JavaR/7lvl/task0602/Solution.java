/*
Упорядоченная информация
Перед тобой — плохой пример использования методов:

Методы разделили двустишие;
Одну строку кода не стоит оборачивать в отдельный метод.
Перепиши код так, чтобы весь текст выводился в методе main, а остальные методы удали.
Вывод программы не должен измениться.
*/

public class Solution {
    public static void printN(String text,int count) {
        for (int a = 0; a < count; a++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printN("Hello bug!",4);
    }

}
