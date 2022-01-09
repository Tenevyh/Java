/* 
ООП - Перегрузка
Перегрузи метод printMatrix() 8 различными способами, 
чтобы в итоге у тебя получилось 10 различных методов printMatrix().
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Integer m, int n, String value){
        System.out.println(m);
        System.out.println(n);
        System.out.println(value);

    }

    public static void printMatrix(int m, Integer n, String value){
        System.out.println(m+n+value);
    }

    public static void printMatrix(Integer m, Integer n, String value){
        if (m<n) {
            System.out.println(m-n+value);
        } else {
            System.out.println(n-m+value);
        }
    }

    public static void printMatrix(Integer m, int n, Object value){
        System.out.println(value.toString()+n+m);
    }

    public static void printMatrix(int m, Integer n, Object value){
        System.out.println(m*2+n+value.toString());
    }

    public static void printMatrix(long m, int n, String value){
        if(m<n){
            System.out.println(value);
        }
    }

    public static void printMatrix(int m, long n, String value){
        System.out.println(m<n?m:value);
    }

    public static void printMatrix(long m, long n, String value){
        System.out.println(value+m+" this "+n);
    }


}