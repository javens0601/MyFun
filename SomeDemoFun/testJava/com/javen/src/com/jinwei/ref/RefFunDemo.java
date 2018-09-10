package com.jinwei.ref;

import java.lang.reflect.Method;

/**
 * Created by jinweih on 2018/9/9.
 */
public class RefFunDemo {
    public static void main(String args[]) {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.jinwei.ref.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Method method = cls.getMethod("sayChina");
            Method method1 = cls.getMethod("sayHello", String.class, int.class);
            method.invoke(cls.newInstance());
            method1.invoke(cls.newInstance(), "javen", 23);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
