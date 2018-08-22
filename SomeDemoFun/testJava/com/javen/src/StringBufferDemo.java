import java.io.File;
import java.io.IOException;

/**
 * Created by jinweih on 2018/8/13.
 * StringBuffer 类
 * RunTime 类
 */
public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Javen");
        Runtime runtime =  Runtime.getRuntime();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(runtime.maxMemory());//JVM最大内存量
        System.out.println("GC before -->>  " + runtime.freeMemory());//JAVA虚拟机空闲内存量
        runtime.gc();
        System.out.println("GC after  -->>  " + runtime.freeMemory());//JAVA虚拟机空闲内存量
        //System.out.println();
        Process process = null;
        /*String [] cmd={"cmd","/C","copy exe1 exe2"};
        File dir = new File("E:\\Work\\Tool\\zookeeper-3.4.3\\bin\\");*/
        try{
        process = runtime.exec("C:\\Program Files (x86)\\EditPlus\\editPlus.exe");
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(process.getErrorStream());
    }
}
