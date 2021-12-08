import java.util.HashMap;

/* 
Успеваемость студентов
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка. Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
Значения можешь выбрать любые.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Джон Уик",3d);
        grades.put("Майк Роу",4d);
        grades.put("Крис Ад",3d);
        grades.put("Лесли Ороу",5d);
        grades.put("Кит Майло",4d);

    }
}
