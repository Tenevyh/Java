import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream=System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream= new PrintStream(outputStream);
        System.setOut(stream);
        
        testString.printSomething();
        String result = outputStream.toString();
        String[] resultArray = result.split(" ");
        System.setOut(consoleStream);
        int a;
        if((resultArray[1]).equals("+")){
        a=Integer.parseInt(resultArray[0])+Integer.parseInt(resultArray[2]);
        } else if ((resultArray[1]).equals("-")) {
        a=Integer.parseInt(resultArray[0])-Integer.parseInt(resultArray[2]);    
        } else if ((resultArray[1]).equals("/")) {
        a=Integer.parseInt(resultArray[0])/Integer.parseInt(resultArray[2]);    
        } else {
            a=Integer.parseInt(resultArray[0])*Integer.parseInt(resultArray[2]);
        }
        
        System.out.println(result+a);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}