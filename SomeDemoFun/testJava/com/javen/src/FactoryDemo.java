/**
 * Created by jinweih on 2018/8/11.
 * @Description 工厂模式
 * 接口对象实例通过工厂获得，以后如再有子类扩充，直接修改工厂类客户端就可以根据标记取得相应实例，灵活性高
 */

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    public Apple () {
        System.out.println("Apple 构造函数");
    }
    public void eat() {
        System.out.println("Eat Apple ... ");
    }
}

class Orange implements Fruit {
    public Orange () {
        System.out.println("Orange 构造函数");
    }
    public void eat() {
        System.out.println("Eat Orange ... ");
    }
}

class Factory {
    private static int count;
    private static Factory factory = new Factory();
    public static Factory getFactory () {
        return factory;
    }

    private Factory () {
        count ++;
        System.out.println("工厂 无参构造函数 -- >> " + count);
    }
    public Fruit getInstance (String className) {
        Fruit fruit = null;
        if ("apple".equalsIgnoreCase(className)){
            fruit = new Apple();
        } else  if ("orange".equalsIgnoreCase(className)){
            fruit = new Orange();
        }
        return fruit;
    }
}

public class FactoryDemo {
    public static final String ENUM_APPLE = "apple";
    public static final String ENUM_ORANGE = "orange";
    public static void main (String arga[]){
        Fruit f = Factory.getFactory().getInstance(ENUM_APPLE);
        f.eat();
        Fruit m = Factory.getFactory().getInstance(ENUM_ORANGE);
        m.eat();
    }
}
