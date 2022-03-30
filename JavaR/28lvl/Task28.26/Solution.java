import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String read;
        while(!(read=reader.readLine()).equals("exit")){
            new ReadThread(read).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName=fileName;
        }
        public void run() {
            byte[] count = new byte[256];
            try(FileInputStream fileR=new FileInputStream(fileName)){
                while (fileR.available()>0){
                    int bytes=fileR.read();
                    count[bytes]++;
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            int maxCount=0;
            int maxCountB=0;
            for (int i=0; i<count.length;i++){
                if (count[i]>maxCount){
                    maxCount=count[i];
                    maxCountB=i;
                }
            }
            resultMap.put(fileName,maxCountB);
        }
    }
}