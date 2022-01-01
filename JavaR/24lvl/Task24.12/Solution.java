/*
Реализовать метод printMainInfo
Напиши реализацию метода printMainInfo, чтобы:
Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
Если в метод передают объект типа Movable, у этого объекта вызывался метод move.
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Movable) {
            Movable movable = (Movable) object;
            movable.move();
        } else if (object instanceof Drawable) {
            Drawable drawable = (Drawable) object;
            drawable.draw();
        }
    }

    interface Movable {
        void move();
    }

    static class Circle implements Movable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}