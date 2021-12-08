/*
Разворот строки
Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder st=new StringBuilder(string);
        st.reverse();
        string=st.toString();
        return string;
    }
}
