/* 
ООП. Hryvnia — тоже деньги
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return null;
        }
        public Object getAmount() {
            return amount;
        }
    }
}