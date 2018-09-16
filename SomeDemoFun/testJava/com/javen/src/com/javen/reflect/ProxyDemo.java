package com.javen.reflect;

import java.util.Map;

/**
 * Created by Javen on 2018/9/12.
 */

class Person{}
public class ProxyDemo {
    public static void main(String args[]) {
        Person per = new Person();
        System.out.println(per.getClass().getClassLoader().getClass().getName());

        StringBuffer strb = new StringBuffer("javen");
        System.out.println(strb.reverse());
        System.out.println(strb.charAt(1));
        System.out.println(strb.append("  Happy"));
        StringBuilder strd = new StringBuilder("JAVEN");
        System.out.println(strd.length());
    }


}
