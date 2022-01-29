import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory(){}
    public static ImageReader getImageReader(ImageTypes r){
        if (r==ImageTypes.BMP) {
            return new BmpReader();
        } else if (r==ImageTypes.JPG){
            return new JpgReader();
        } else if (r==ImageTypes.PNG) {
            return new PngReader();
        } else if (r==null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        } else
            throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
