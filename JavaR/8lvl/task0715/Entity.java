/*
Наследование методов
Правильно унаследуй классы:

человека — от существа;
Java-девелопера — от человека.
Удали дублирующие методы.
*/

public class Entity {
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }
}