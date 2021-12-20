/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
       public void move(){
           move();
       }
        public void eat(){
            eat();
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void move(){
            move();
        }
        public void eat(){
            eat();
        }
        public void fly(){
            fly();
        }
    }

    public class Car implements CanMove {
        public void move(){
            move();
        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move(){
            move();
        }
        public void fly(){
            fly();
        }
    }
}