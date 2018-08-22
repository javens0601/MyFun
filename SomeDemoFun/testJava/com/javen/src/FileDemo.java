import java.io.File;
import java.io.IOException;

/**
 * Created by jinweih on 2018/8/22.
 * Windows中使用反斜杠 “\” 来标识路径
 * Linux中使用斜杠 “/”来标识路径
 * 既然java程序本身具有可移植性的特点，在编写路径的时候最好根据程序所在的操作系统自动使用符合本地操作系统要求的分隔符，这样才能达到可移植性的目的。
 * 要实现这样的功能，则需要观察File类中提供的两个变量。
 */
public class FileDemo {
    public static void main(String args[]) {
        File file = new File("D:\\FileDemo.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileDemo2();
    }

    public static void FileDemo2() {
        /**
         * 调用静态常量
         */
        System.out.println("PathSeparator" + File.pathSeparator);//表示路径分隔符
        System.out.println("Separator" + File.separator);//表示路径分隔符
    }
}
