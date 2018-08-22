/**
 * Created by jinweih on 2018/8/11.
 */
class Demo{
    private String name;

    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态构造块");
    }
    public Demo() {
        System.out.println("无参构造函数");
    }
    public Demo(String name) {
        new Demo();
        System.out.println("有惨构造含数-->> " + name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class pricateStatic {
    static {
        System.out.println("main方法静态构造块");
    }
    public static void main(String args[]) {
        new Demo("靳威");
        new Demo("男神");
    }
}


