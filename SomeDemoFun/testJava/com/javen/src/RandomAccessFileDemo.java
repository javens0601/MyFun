import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by jinweih on 2018/8/22.
 * File 类只是针对文件本身进行操作，而如果要对文件内容进行操作，则使用RandomAccessFile类，此类属于随机读取类，可以随机读取一个文件中指定位置的数据。
 *
 */
public class RandomAccessFileDemo {
    public static void main(String args[]) {
        File file = new File("D:" + File.separator + "test.txt");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            String str = "Hello World";
            byte[] b = str.getBytes();
            outputStream.write(b);
            outputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
/**
 * 字节流与字符流的基本操作
 * 在程序中所有的数据都是以流的形式进行传输或保存的，程序需要数据是要使用输入流读取数据，而当程序需要保存数据时候就需要输出流
 * 在 java.io 包中流的操作主要有字节流和字符流两大类，两类都有输入和输出操作。
 * 在字节流中输出数据主要使用OutputStream,输入使用的是InputStream。
 * 在字符流中输出数据使用Write类完成，输入主要使用Reader类完成。
 */

/**
 * java io 操作主要流程:
 *  (1) 使用File类打开一个文件
 *  (2) 通过字节流或者字符流的子类输出指定位置
 *  (3) 进行读写操作
 *  (4) 关闭输入输出流
 */

/**
 * 字节流
 * 字节流主要操作byte  类型数据，以byte数组为准，主要操作类是OutputStream 类和InputStream 类
 * public void close() throws IOException 关闭输出流
 * public void flush() throws IOException 刷新缓冲区
 * public void write(byte[] b) throws IOException 将一个byte数组写入数据流
 * public void write(byte[] b, int off, int len) throws IOException 将一个指定范围的数组写入数据流
 * public abstract void write(int b) throws IOException 将一个字节数据写入数据流
 *
 * Closeable
 * Flushable
 */
