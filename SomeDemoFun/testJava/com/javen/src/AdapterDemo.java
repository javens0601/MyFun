
/**
 * Created by jinweih on 2018/8/11.
 * @Description 适配器模式
 * 一个类实现一个接口，要实现所有的抽象方法，如果一个接口中抽象方法较多，而子类不需要这么多方法，此时需要中间的一个过渡，但是此过渡类又不希望被直接使用，所以将此过渡类定义为抽象类最为合适
 */
interface Adapter {
    void open ();
    void close();
    void stop();
}

abstract class WindowAdapte implements Adapter {
    public void open(){}
    public void close(){}
    public void stop(){}
}

class WindowImpl extends WindowAdapte {
    public void open () {
        System.out.println("适配器实现");
    }
}
public class AdapterDemo {
    public static void main(String args[]){
        Adapter adapter = new WindowImpl();
        adapter.open();
    }
}
