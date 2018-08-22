import java.io.File;
import java.io.IOException;

/**
 * Created by jinweih on 2018/8/22.
 */
public class FileDemo {
    public static void main(String args[]) {
        File file = new File("D:\\FileDemo.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
