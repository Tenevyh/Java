/*
Ежик и яблоко
Наша задача — накормить ежика. Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого вызвать метод eat и передать нужный аргумент — яблоко.
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple obj=new Apple();
        Hedgehog obj2=new Hedgehog();
        obj2.eat(obj);
    }

    public static class Apple {
    }
}
