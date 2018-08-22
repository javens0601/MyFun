/**
 * Created by jinweih on 2018/8/11.
 * Description 单例模式
 * 将构造方法私有化，控制实例化对象的产生
 */
class Singleton {
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
    int count;
    private Singleton () {
        count++;
        System.out.println("私有构造函数 -- >> " + count);
    }
    public void print(){
        System.out.println("Hello World");
    }
}
public class SingletonDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.print();
        singleton2.print();
    }
}
