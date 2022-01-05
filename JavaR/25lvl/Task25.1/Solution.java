/* 
ООП - Расставить интерфейсы
Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
Реализуй их методы.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Sellable, Discountable, Movable {
        public Clothes getAllowedAction(){
            return new Clothes();
        }
        public Clothes getAllowedAction(String name){
            return new Clothes();
        }
        public boolean isMovable(){
            return true;
        }
    }
}