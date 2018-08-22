/**
 * Created by jinweih on 2018/8/12.
 * 泛型
 */
class Generics<T> {
    private T var;
    private T name;
    public void setVar(T var) {
        this.var = var;
    }

    public void setName(T name) {
        this.name = name;
    }
    public  T getVar(){
        return var;
    }
    public T getName() {
        return name;
    }
}
public class GenericsDemo {
    public  static void main(String args[]){
        Generics<Integer> generics = new Generics<Integer>();
        generics.setVar(30);
        generics.setName(30);
        System.out.println(generics.getName().compareTo(generics.getVar()));
    }
}
