package com.javen.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jinweih on 2018/9/15.
 */
interface Subject {
    String say(String name, int age);
}

class RealSubject implements Subject {
    public String say(String name, int age) {
        return "name -->> " + name + "\tage -->> " + age;
    }
}

public class MyInvocationHandler implements InvocationHandler{
    private Object object;//真实主题
    public Object bind(Object object) {//绑定真实操作主题
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);//取得代理对象
    }

    public Object invoke(Object proxy, Method method, Object[] args)//动态调用方法
            throws Throwable {
        Object temp = method.invoke(this.object, args);//调用方法传入真实主题和参数
        return temp;//返回方法的返回信息

    }

}
