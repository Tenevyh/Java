/* 
Интерфейс Updatable в классе Screen
Реализуй интерфейс Updatable в классе Screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        public void refresh(){}
        public void onSelect(){}
    }
}