/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти,
 а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread test=new TestThread();
        test.start();
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public TestThread(){
        }

        @Override
        public void run() {
            super.run();
        }
    }
}