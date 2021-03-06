import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе ArrayList.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка. Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage. Метод search(String) ищет элемент в списке storage и возвращает его индекс. Если элемента нет в списке — возвращает -1.
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        this.storage.add(0,s);
    }

    public String pop() {
      String a=this.storage.get(0);
        this.storage.remove(0);
        return a;
    }

    public String peek() {
        String a=this.storage.get(0);
        return a;
    }

    public boolean empty() {
        boolean a=this.storage.isEmpty();
        return a;
    }

    public int search(String s) {
        if(this.storage.contains(s)){
            int a=this.storage.indexOf(s);
            return a;
        }
        else {
            return -1;
        }
    }
}
