/* 
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.


*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        public String getName(){
            return "Mimo";
        }
        public Pet getChild(){
            Pet pet=new Cat();
            return pet;
        }
    }

    public static class Dog extends Pet{

        public String getName(){
            return "Nano";
        }
        public Pet getChild(){
            Pet pet=new Dog();
            return pet;
        }
    }

}