/*
Объекты внутренних и вложенных классов
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному объекту каждого из них.
*/

public class Solution {
    public static void main(String[] args) {
        Outer n=new Outer();
        Outer.Inner b=new Outer().new Inner();
        Outer.Nested a=new Outer.Nested();
    }
}
