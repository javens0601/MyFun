import javafx.beans.InvalidationListener;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jinweih on 2018/8/13.
 * 观察者设计模式
 * 在java.util 包中提供了Observable类和Observer接口，使用它们即可完成观察者模式。
 * 需要被观察的类必须继承Observable类
 */
class House extends Observable {
    private float price;
    public House (float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        /*super.setChanged();//设置变化点
        super.notifyObservers(price);//通知 所有观察者价格变化*/
        this.price = price;
    }
    public void addPrice (float price) {
        System.out.println("设置变化点");
        super.setChanged();//设置变化点
        super.notifyObservers(price * 2);//通知 所有观察者价格变化
    }
}

class PriceObserver implements Observer {
    private String name;
    public PriceObserver (String name) {
        this.name = name;
    }
    public void update(Observable o, Object arg){
        //if (arg instanceof Float) {
            System.out.println(this.name + "观察到价格为 ： " +   ((Float) arg).floatValue());
        //}
    }
}
public class ObserverDemo {
    public static void main(String args[]) {
        House h = new House(1000);
        PriceObserver po = new PriceObserver("A");
        PriceObserver po1 = new PriceObserver("B");
        PriceObserver po2 = new PriceObserver("C");
        h.addObserver(po);
        h.addObserver(po1);
        h.addObserver(po2);
        System.out.println("HOUSE PRICE IS : " + h.getPrice());
        h.setPrice(2000);
        System.out.println("HOUSE PRICE IS : " + h.getPrice());
        h.addPrice(100);
        System.out.println("HOUSE PRICE IS : " + h.getPrice());
    }
}
