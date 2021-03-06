import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
Используя StringTokenizer раздели query на части по разделителю delimiter.
Максимально возможное количество токенов - 6.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        String[] arrayS=new String[6];
        StringTokenizer deli=new StringTokenizer(query,delimiter);
        int i=0;
        while (deli.hasMoreTokens()){
            String token= deli.nextToken();
            arrayS[i]=token;
            System.out.println(deli);
            i++;
        }

        return arrayS;
    }
}

