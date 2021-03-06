/*
Дорожное движение
Классы Car и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Car и Bus их убери.
*/

public interface Vehicle {
    public default void start() {
        System.out.println("Начинаю движение.");
    }
    void move();
    public default void stop() {
        System.out.println("Останавливаюсь.");
    }
}
