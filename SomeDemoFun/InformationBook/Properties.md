## *属性类 Properties*
***Properties*** 类本身是 *HashTable* 类的子类，数据存放也是按照key和value的形式存放数据的。   

	public class Properties extends HashTable<Object, Object>

> ***Properties*** 类的主要方法：
> 
- public Properties() //构造一个空的属性类
- public Properties(Properties defaults) //构造一个指定属性内容的类
- public String getProperty(String key) //根据属性的key取得属性的value，如果没有key则返回null
- public String getProperty(String key, String defaultValue) //根据属性的key取得属性的value，如果没有key，则返回defaultValue
- public Object setProperty(String key, String value) //设置属性
- public void list(PrintStream ouot) //属性打印
- public void load(InputStream inStream) throws IOException //从输入流中取出全部的属性内容 
- public void loadFormXML(InputStream in) throws IOException, InvalidPropertiesFormatException //从XML文件格式中读取内容
- public void store(OutputStream os, String comment) throws IOException //将属性内容通过输出流输出，同时声明属性的注释
- public void storeToXML(OutputStream os, String comment) throws IOException //以XML文件格式输出属性，默认编码
- public void storeToXML(OutputStream os, String comment, String encoding) throws IOException //以XML文件格式输出，用户指定默认编码
 

	import java.io.*;
	import java.util.Properties;
	
	/**
	 * Created by Javen on 2018/8/24.
	 */
	public class PropertiesDemo {
	    public static void main(String args[]) {
	        writePropertiesFile(); //写 Properties 文件
	        readPropertiesFile();  //读 Properties 文件
	    }
	
	    public static void writePropertiesFile() {
	        File file = new File("D:" + File.separator + "PropertiesDemoWrite.txt");
	        File file2 = new File("D:" + File.separator + "PropertiesDemoWriteXml.txt");
	        Properties properties = new Properties();
	        properties.setProperty("javen", "19950601");
	        properties.setProperty("nanshen", "19960101");
	        properties.setProperty("kunshen", "19940101");
	        properties.setProperty("zuqiang", "19940201");
	        try {
	            properties.store(new FileOutputStream(file), "PropertiesDemo");//写文件
	            properties.storeToXML(new FileOutputStream(file2), "PropertiesDemoXml", "utf-8");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    public static void readPropertiesFile() {
	        File file = new File("D:" + File.separator + "PropertiesDemoWrite.txt");
	        File file2 = new File("D:" + File.separator + "PropertiesDemoWriteXml.txt");
	        Properties properties = new Properties();
	        Properties properties2 = new Properties();
	        try {
	            properties.load(new FileInputStream(file));
	            properties2.loadFromXML(new FileInputStream(file2));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        String jw = properties.getProperty("javen");
	        String ns = properties.getProperty("nanshen");
	        String zq = properties.getProperty("gangge");//不存在的key
	        String ks = properties.getProperty("kunshen");
	        System.out.println( jw + "\n" + ns + "\n" + zq + "\n" + ks);
	    }
	}

