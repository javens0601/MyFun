import java.io.Serializable;

/**
 * Created by jinweih on 2018/8/22.
 * 定义可以序列化的类
 * 对象输出流 ObjectOutputStream
 * 对象输入流 ObjectInputStream
 * 使用对象输出流输出序列化对象的步骤也成为序列化
 * 使用对象输入流读入对象的过程也称为反序列化
 */
public class SerializableDemo implements Serializable{
    private String name;
    private int age;
    public SerializableDemo (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Name --->> " + name + "Age --->> " + age;
    }
}
