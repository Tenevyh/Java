import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.
*/

public class Solution {
    public static void main(String[] args) {
        String key=args[0];
        if(!(key.equals("-e") || key.equals("-d"))){
            return;
        } 
        
        try(FileInputStream fileIn=new FileInputStream(args[1]);
        FileOutputStream fileOut=new FileOutputStream(args[2])){
            
            if(key.equals("-e")){
                while(fileIn.available()>0){
                    fileOut.write(fileIn.read()+15);
                }
            } else {
                while (fileIn.available()>0) {
                    fileOut.write(fileIn.read()-15);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
