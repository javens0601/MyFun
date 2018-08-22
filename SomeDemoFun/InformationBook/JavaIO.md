# *Java IO* #
***

*Java IO* 操主要是指对Java进行输入输出操作，*Java* 中所有的操作类都存放在 ***java.io*** 包中，在使用是需要导入此包。

在整个 ***java.io*** 包中最重要的就是5个类和1个接口，5个类是指 ***File,OutputStream,InputStream,Writer,Reader*** ；一个接口是指 ***Serializable*** 。
   
   
>区块引用测试   


	import java.io.IOException;

	/**
	 * Created by jinweih on 2018/8/22.
	 * 测试写文件
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

