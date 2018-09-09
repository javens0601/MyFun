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
            method.invoke(cls.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
