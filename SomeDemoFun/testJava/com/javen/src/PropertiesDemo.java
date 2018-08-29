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
        properties.setProperty("javen", "靳威");
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
