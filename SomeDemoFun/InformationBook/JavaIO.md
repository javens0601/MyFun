# *Java IO* #
***

*Java IO* 操主要是指对Java进行输入输出操作，*Java* 中所有的操作类都存放在 ***java.io*** 包中，在使用是需要导入此包。

在整个 ***java.io*** 包中最重要的就是5个类和1个接口，5个类是指 ***File,OutputStream,InputStream,Writer,Reader*** ；一个接口是指 ***Serializable*** 。
   
   
>区块引用测试   

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
	        String path = "D:" + File.separator + "FileDemo.txt";
	        File file = new File(path);
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
   
###*字节流和字符流的区别*
* 字节流在操作时候本身不会用到缓冲区，是文件本身直接操作的
* 字符流在操作时使用了缓冲区。通过缓冲再操作文件
![字节流与字符流的区别](image/1.JPG)