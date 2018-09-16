package com.javen.reflect;

/**
 * Created by jinweih on 2018/9/15.
 */
public class DynaProDemo {
    public static void main (String args[]) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Subject subject = (Subject)myInvocationHandler.bind(new RealSubject());
        System.out.println(subject.say("javen", 23));
    }
}
