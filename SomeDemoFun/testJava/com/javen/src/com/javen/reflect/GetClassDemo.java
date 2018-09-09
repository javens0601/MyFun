package com.javen.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by jinweih on 2018/8/30.
 */
class Te{
    private String name;
    public Te(){}
    public Te (String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Te --- >> " + this.getName();
    }
}
public class GetClassDemo {
    public static void main(String args[]) {
        Class<?> te = null;
        try {
            te = Class.forName("com.javen.reflect.Te");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Constructor<?> constructor[] = null;
        constructor = te.getConstructors();
        Te te1 = null;
        try{
            te1 = (Te)constructor[1].newInstance("javen");
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(InvocationTargetException e) {
            e.printStackTrace();
        }
        //te1.setName("Javen");
        System.out.println(te1);
    }
}

/*public static Class<?> forName(String className) throws ClassNotFoundException //传入完整的“包.类”名称实例化CLass对象
public Constructor[] getConstructors() throws SecurityException //得到一个类中的全部构造方法*/

