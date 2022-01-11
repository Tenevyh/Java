import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
В статическом блоке инициализируй labels пятью различными парами ключ-значение.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(1.2,"b");
    labels.put(1.3,"kb");
    labels.put(1.4,"mb");
    labels.put(1.5,"gb");
    labels.put(1.6,"tb");

}
    public static void main(String[] args) {
        System.out.println(labels);
    }
}