/**
 * Created by Javen on 2018/8/27.
 */

enum Sex {
    MAN("男"),
    WOMEN("女");
    private String name;
    Sex(String name) {
        this.setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class People {
    private String name;
    private int age;
    private Sex sex;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }
    public Sex getSex() {
        return sex;
    }
    public String toString() {
        return "名称 ：" + this.name + "\t年龄 ：" + this.age + "\t性别 ：" + this.sex.getName();
    }
}
public class EnumDemo {
    public static void main(String args[]) {
        People pe = new People();
        pe.setSex(Sex.MAN);
        pe.setName("javen");
        pe.setAge(23);
        System.out.println(pe);
        System.out.println(pe.getClass().getName());
        System.out.println(pe.getClass().getDeclaredClasses());
    }
}

