package com.javarush.task.pro.task17.task1717;

/* 
Кто летит?
Классы Eagle (Орел), Raven (Ворон) и Aircraft (Самолет) имплементируют интерфейс Flyable, который содержит дефолтную реализацию метода int getMaxSpeed() и возвращает значение 80.
Такая реализация неправильная, так как реальная максимальная скорость Орла — 180 км/ч, Ворона — 48, а самолета — 1200.

Тебе нужно убрать дефолтную реализацию метода getMaxSpeed() из интерфейса Flyable (сам метод нужно оставить) и имплементировать его в каждом из классов.
Для каждого класса укажи правильное значение максимальной скорости.
*/

public interface Flyable {
    public int getMaxSpeed();
}
